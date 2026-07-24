function solution(n, lost, reserve) {
    const realReserve = reserve.filter(r => !lost.includes(r)).sort((a, b) => a - b);
    const realLost = lost.filter(l => !reserve.includes(l)).sort((a, b) => a - b);

    let answer = n - realLost.length;

    for (const r of realReserve) {
        const idx = realLost.findIndex(l => l === r - 1 || l === r + 1);
        if (idx !== -1) {
            answer++;
            realLost.splice(idx, 1);
        }
    }
    return answer;
}