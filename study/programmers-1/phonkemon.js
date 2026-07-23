function mySolution(nums) {
    const start = performance.now();

    var answer = 0;

    const phonkemon = new Map();
    for (let i = 0; i < nums.length; i++) {
        phonkemon.set(nums[i], (phonkemon.get(nums[i]) ?? 1));
    }

    answer = Math.min(nums.length / 2, phonkemon.size);
    // answer = (nums.length / 2) > (phonkemon.size) ? phonkemon.size : nums.length / 2;
    
    const end = performance.now();
    console.log(`mySolution 실행 시간: ${end - start}ms`);

    return answer;
}

function bestSolution(nums) {
    const start = performance.now();

    var answer = 0;
    const phonkemon = new Set(nums);
    answer = Math.min(phonkemon.size, nums.length / 2);

    const end = performance.now();
    console.log(`bestSolution 실행 시간: ${end - start}ms`);

    return answer;
}

console.log(mySolution([3, 3, 3, 2, 2, 2]));    // 0.009ms
console.log(bestSolution([3, 3, 3, 2, 2, 2]));  // 0.003ms