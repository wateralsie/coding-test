function mySolution(arr) {
    const start = performance.now();
    const answer = [];
    // for (const a of arr) {
    //     if (answer.at(-1) === a) continue;
    //     answer.push(a);
    // }
    for (let i = 0; i < arr.length; i++) {
        if (answer.at(-1) === arr[i]) continue;
        answer.push(arr[i]);
    }
    // arr.forEach(a => {
    //     if (answer.at(-1) === a) return;
    //     answer.push(a);
    // })
    const end = performance.now();
    console.log(`mySolution 실행 시간: ${end - start}ms`)
    return answer;
}

function anotherSolution(arr) {
    const start = performance.now();
    const answer = arr.filter((val, index) => {
        console.log(arr[index+1]);
        val !== arr[index+1]    // 마지막 요소는 undefined와 비교하기에 true
        console.log(val !== arr[index+1]);
    })
    const end = performance.now();
    console.log(`anotherSolution 실행 시간: ${end - start}ms`)
    return answer;
}

console.log(mySolution([1,1,3,3,0,1,1]));
console.log(mySolution([4,4,4,3,3]));

console.log(anotherSolution([1,1,3,3,0,1,1]));
console.log(anotherSolution([4,4,4,3,3]));