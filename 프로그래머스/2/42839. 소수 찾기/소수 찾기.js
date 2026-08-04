function solution(numbers) {
    const numberList = numbers.split("");
    const possibleNumberList = [];

    function recursion(number, nums) {
        if (number && !possibleNumberList.includes(+number)) possibleNumberList.push(+number);
        if (nums.length < 1) return;
        nums.forEach((n, idx) => {
            recursion(number + n, nums.toSpliced(idx, 1));
        });
    }

    for (let i = 0; i < numberList.length; i++) {
        const number = "";
        recursion(number, [...numberList]);
    }

    const primeNumberList = possibleNumberList.filter(number => {
        if (number < 2) return false;
        for (let i = 2; i * i <= number; i++ ) {
            if (Math.floor(number / i) === number / i) return false;
        }
        return true;
    })
    
    return primeNumberList.length;
}