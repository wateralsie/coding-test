/**
 * 
 * @param {number[]} numbers 
 */
function solution(numbers) {
    let answer = "";
    const sortedNums = numbers.toSorted((a, b) => {
        if (Number(`${a}${b}`) < Number(`${b}${a}`)) {
            return 1;
        } else if (Number(`${a}${b}`) > Number(`${b}${a}`)) {
            return -1;
        }
        return 0;
    });

    // "0000" 대응
    if (sortedNums[0] === 0) answer = "0";
    else answer = sortedNums.join("");

    return answer;
}

/**
 * 
 * @param {number[]} numbers 
 */
function bestSolution(numbers) {
    let answer = numbers.toSorted((a, b) => `${b}${a}` - `${a}${b}`).join("");
    // 숫자-문자열 변환 방식 익히기
    // let answer = numbers
    //                 .map(n => n + "")
    //                 .sort((a, b) => (b+a)*1 - (a+b)*1)
    //                 .join("");
    return answer[0] === '0' ? "0" : answer;
}

function attempt(numbers) {
    const sortedNums = numbers.toSorted((a, b) => {
        if (b / a === 10 && String(a) < String(b)){
            return -1;
        } else if (a / b === 10 && String(a) > String(b)) {
            return 1;
        } else if (String(a) < String(b)) {
            return 1;
        } else if (String(a) > String(b)) {
            return -1;
        } else {
            return 0;
        }
    });
    return sortedNums.join("");
}

console.log(solution([6, 10, 2]));
console.log(solution([3, 30, 34, 5, 9]));
console.log(solution([0, 0, 0, 0]));