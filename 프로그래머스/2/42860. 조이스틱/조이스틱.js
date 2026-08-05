function solution(name) {
    const n = name.length;
    let answer = 0;

    for (const c of name) {
        const up = c.charCodeAt(0) - "A".charCodeAt(0); 
        const down = "Z".charCodeAt(0) - c.charCodeAt(0) + 1;
        answer += Math.min(up, down);
    }

    let move = n - 1;

    for (let i = 0; i < n; i++) {
        let next = i + 1;
        while (next < n && name[next] === "A") {
            next++;
        }
        const backtrack = Math.min(i, n - next) * 2 + Math.max(i, n - next);
        move = Math.min(move, backtrack);
    }

    return answer + move;
}