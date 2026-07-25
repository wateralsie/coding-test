// 경로 탐색, 백트래킹
function dfsRecursion(node) {
    visited.add(node);
    for (const next of graph[node]) {
        if (!visited.has(next)) dfs(next);
    }
}

function dfsStack(node) {
    const visited = new Set();
    const stack = [start];
    while (stack.length) {
        const node = stack.pop();
        if (visited.has(node)) continue;
        visited.add(node);
        for (const next of graph[node]) {
            if (!visited.has(next)) stack.push(next);
        }
    }
}

// 최단 거리, 최소 횟수
function bfs(start) {
    const queue = [start];
    const visited = new Set([start]);
    while (queue.length) {
        const node = queue.shift();
        for (const next of graph[node]) {
            if (!visited.has(next)) {
                visited.add(next);
                queue.push(next);
            }
        }
    }
}
function bfsPointer(start) {
    const queue = [start];
    const visited = new Set([start]);
    let head = 0;

    while (head < queue.length) {
        const node = queue[head++];
        for (const next of graph[node]) {
            if (!visited.has(next)) {
                visited.add(next);
                queue.push(next);
            }
        }
    }
}