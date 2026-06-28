function mySolution(participant, completion) {
    const start = performance.now();
    let answer = '';
    participant.sort();
    completion.sort();
    for (let i in participant) {
        if (participant[i] !== completion[i]) {
            answer = participant[i];
            break;
        } 
    }
    const end = performance.now();
    console.log(`mySolution 실행 시간: ${end - start}ms`);
    return answer;
}

// 해시 사용
function anotherSolution(participant, completion) {
    const start = performance.now();
    let answer = '';
    const map = new Map();
    for (let i = 0; i < participant.length; i++) {
        let p = participant[i], c = completion[i];
        map.set(p, (map.get(p) || 0) + 1);
        map.set(c, (map.get(c) || 0) - 1);
    }
    console.log(map);
    for (let [k, v] of map) {
        if (v > 0) answer = k;
    }
    const end = performance.now();
    console.log(`anotherSolution 실행 시간: ${end - start}ms`);
    return answer;
}

console.log(mySolution(["leo", "kiki", "eden"], ["eden", "kiki"]));
console.log(mySolution(["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]));
console.log(mySolution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]));

console.log(anotherSolution(["leo", "kiki", "eden"], ["eden", "kiki"]));
console.log(anotherSolution(["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]));
console.log(anotherSolution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]));