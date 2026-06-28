function solution(array, commands) {
    const answer = [];
    commands.forEach(function(command) {
        const slicedArray = array.slice(command[0] - 1, command[1]);
        const sortedArray = slicedArray.sort((a, b) => a - b);
        answer.push(sortedArray[command[2] - 1]);
    });
    return answer;
}