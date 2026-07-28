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
    if (sortedNums[0] === 0) answer = "0";
    else answer = sortedNums.join("");
    return answer;
}