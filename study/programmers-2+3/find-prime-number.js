/**
 * 
 * @param {string} numbers 
 * @returns 
 */
function refactoredSolution(numbers) {
    const numberList = numbers.split("");
    const possibleNumberList = new Set();

    function makeNumber(numStr, remaining) {
        // 가독성 측면에서 +numStr에서 Number(numStr)로 변경
        if (numStr) possibleNumberList.add(Number(numStr));
        if (remaining.length > 0) {
            remaining.forEach((n, idx) => {
                makeNumber(numStr + n, remaining.toSpliced(idx, 1));
            });
        }
    }

    function isPrime(number) {
        if (number < 2) return false;
        if (number === 2) return true;
        // 소수는 2 제외 홀수
        if (number % 2 === 0) return false;
        for (let i = 3; i * i <= number; i += 2) {
            if (number % i === 0) return false;
        }
        return true;
    }

    // main
    makeNumber("", [...numberList]);
    const primeNumberList = [...possibleNumberList].filter(number => isPrime(number));
    return primeNumberList.length;
}

console.log(refactoredSolution("17"));
console.log(refactoredSolution("011"));