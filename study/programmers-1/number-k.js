function mySolution(array, commands) {
    const answer = [];
    commands.forEach(function(command) {
        const slicedArray = array.slice(command[0] - 1, command[1]);
        const sortedArray = slicedArray.sort((a, b) => a - b);
        answer.push(sortedArray[command[2] - 1]);
    });
    return answer;
}

function anotherSolution(array, commands) {
    return commands.map(command => {
        const [i, j, k] = command;
        const newArray = array
            .filter((value, index) => index >= i - 1 && index <= j - 1)
            .sort((a, b) => a - b);
        return newArray[k - 1];
    });
}

// console.log(mySolution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3],[4, 4, 1],[1, 7, 3]]));
console.log(anotherSolution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3],[4, 4, 1],[1, 7, 3]]));