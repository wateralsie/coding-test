function solution(maps) {
    const n = maps.length, m = maps[0].length;
    const dist = Array.from({ length: n }, () => new Array(m).fill(0));

    const dy = [-1, 1, 0, 0];
    const dx = [0, 0, -1, 1];

    const queue = [[0, 0]];
    let head = 0;
    dist[0][0] = 1;

    while (head < queue.length) {
        const [y, x] = queue[head++];
        for (let d = 0; d < 4; d++) {
            const ny = y + dy[d];
            const nx = x + dx[d];

            if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;
            if (maps[ny][nx] === 0) continue;
            if (dist[ny][nx] !== 0) continue;

            dist[ny][nx] = dist[y][x] + 1;
            queue.push([ny, nx]);
        }
    }
    return dist[n-1][m-1] === 0 ? -1 : dist[n-1][m-1];
}