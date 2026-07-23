function solution(nums) {
    var answer = 0;

    const phonkemon = new Map();
    for (let i = 0; i < nums.length; i++) {
        phonkemon.set(nums[i], (phonkemon.get(nums[i]) ?? 1));
    }

    answer = Math.min(nums.length / 2, phonkemon.size);
    
    return answer;
}