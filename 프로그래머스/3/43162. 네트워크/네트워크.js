function solution(n, computers) {
    let answer = 0;
    const start = 0;
    const visited = new Array(n).fill(false);

    function dfs(c1) {
        visited[c1] = true;
        for (let c2 = 0; c2 < computers[c1].length; c2++) {
            if (!visited[c2] && computers[c1][c2] === 1) {
                dfs(c2);
            }
        }
    }

    for (let start = 0; start < n; start++) {
        if (!visited[start]) {
            dfs(start);
            answer++;
        }
    }

    return answer;
}