/**
 * 
 * @param {number} n 
 * @param {number[][]} computers 
 * @returns number
 */
function solution(n, computers) {
    const visited = new Array(n).fill(false);
    // 네트워크 구조까지 알아내는 연습 차원에서 추가
    const networks = [];

    function dfs(c1, network) {
        visited[c1] = true;
        network.push(c1);
        for (let c2 = 0; c2 < computers[c1].length; c2++) {
            if (!visited[c2] && computers[c1][c2] === 1) {
                network.push(c2);
                dfs(c2, network);
            }
        }
    }

    for (let start = 0; start < n; start++) {
        if (!visited[start]) {
            const network = [];
            dfs(start, network);
            networks.push(network);
        }
    }

    return networks.length;
}


function attempt(n, computers) {
    const start = 0;
    const visited = new Set([start]);
    const networks = [];

    function dfs(c1) {
        const network = [c1];
        visited.add(c1);
        for (let c2 = c1; c2 < computers[c1].length; c2++) {
            if (computers[c1][c2] === 0) {
                networks.push(network);
                continue;
            }
            if (c1 !== c2) {
                network.push(c2);
            }
        }
        if (!visited.has(c1)) {
            dfs(c1 + 1);
        }
    }
    
    dfs(start);
    console.log(networks);
    return networks.length;
}


console.log(solution(3, [[1, 1, 0], [1, 1, 0], [0, 0, 1]]));
console.log(solution(3, [[1, 1, 0], [1, 1, 1], [0, 1, 1]]));