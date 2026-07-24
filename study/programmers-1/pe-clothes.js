/**
 * @param {number} n
 * @param {number[]} lost 
 * @param {number[]} reserve 
 */
function mySolution(n, lost, reserve) {
    // lost, reserve에 존재하는 학생 번호 제거
    const realReserve = reserve.filter(r => !lost.includes(r)).sort((a, b) => a - b);
    const realLost = lost.filter(l => !reserve.includes(l)).sort((a, b) => a - b);

    let answer = n - realLost.length;

    // lost 학생 번호가 reserve 학생의 바로 앞 또는 바로 뒷번호
    // 위 조건에 부합하는 lost 학생 존재시 대여 & 해당 lost 학생 번호 배열에서 제거
    for (const r of realReserve) {
        const idx = realLost.findIndex(l => l === r - 1 || l === r + 1);
        if (idx !== -1) {
            answer++;
            realLost.splice(idx, 1);
        }
    }
    return answer;
}

function anotherSolution(n, lost, reserve) {
    const students = new Array(n + 2).fill(1);
    students[0] = -1;
    students[n + 1] = -1;

    for (const num of lost) students[num]--;
    for (const num of reserve) students[num]++;

    for (let i = 1; i <= n; i++) {
        if (students[i] !== 2) continue;

        if (students[i - 1] === 0) {
            students[i - 1]++;
            students[i]--;
        } else if (students[i + 1] === 0) {
            students[i + 1]++;
            students[i]--;
        }
    }

    return students.slice(1, n + 1).filter(count => count >= 1).length;
}

function anotherSolution2(n, lost, reserve) {
    const students = {};
    let answer = 0;
    for(let i = 1; i <= n; i++){
        students[i] = 1;
    }
    lost.forEach(number => students[number] -= 1);
    reserve.forEach(number => students[number] += 1);

    for(let i = 1; i <= n; i++){
        if(students[i] === 2 && students[i-1] === 0){
                students[i-1]++;
                students[i]--;
        } else if(students[i] === 2 && students[i+1] === 0){
                students[i+1]++;
                students[i]--;
        }
    }
    for(let key in students){
        if(students[key] >= 1){
            answer++;
        }
    }
    return answer;
}

/**
 * @param {number} n
 * @param {number[]} lost 
 * @param {number[]} reserve 
 */
function attempt(n, lost, reserve) {
    var answer = n - lost.length;
    lost.sort((a, b) => a - b);
    reserve.sort((a, b) => a - b);
    
    for (let i = 0; i < reserve.length; i++) {
        if (lost.find(l => l === reserve[i])) {
            answer++;
            lost = lost.filter(l => l !== reserve[i]);
            reserve = reserve.filter(r => r !== reserve[i]);
        }
    }

    for (let i = 0; i < reserve.length; i++) {
        available = lost.find(l => l === reserve[i] - 1 || l === reserve[i] + 1);
        if (available) {
            answer++;
            lost = lost.filter(l => l !== available);
        }
    }
    
    return answer;
}

// 테스트케이스 13, 18번 통과못한 원인
// 정렬이 안된 경우에 대한 대응이 되어있지 않았음

// 테스트케이스 5, 24번 통과못한 원인
// reserve와 lost의 중복 원소 처리 로직과 여벌의 체육복을 나눠 주는 로직을 하나의 반복문 안에서 한꺼번에 처리함
// reserve와 lost에 존재하는 학생에게 체육복을 빌려주는 경우 존재하기 때문

// 테스트케이스 1, 7, 24번 통과못한 원인
// reserve = reserve.filter(r => r !== reserve[i]);
// 순회 중인 배열의 요소를 변경했기 때문..


console.log(mySolution(5, [2, 4], [1, 3, 5]));
console.log(mySolution(3, [3], [1]));
console.log(mySolution(5, [2, 3, 4], [1, 3]));