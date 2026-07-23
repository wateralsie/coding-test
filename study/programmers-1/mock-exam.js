function bestSolution(answers) {
    const start = performance.now();

    var answer = [];

    const person1 = [1, 2, 3, 4, 5];
    const person2 = [2, 1, 2, 3, 2, 4, 2, 5];
    const person3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

    const scores = [0, 0, 0];

    for (let i = 0; i < answers.length; i++) {
        if (answers[i] == person1[i % person1.length]) scores[0]++;
        if (answers[i] == person2[i % person2.length]) scores[1]++;
        if (answers[i] == person3[i % person3.length]) scores[2]++;
    }

    const max = Math.max(...scores);
    for(let i = 0; i < scores.length; i++) {
        if (max == scores[i]) answer.push(i + 1);
    }

    const end = performance.now();
    console.log(`bestSolution 실행 시간: ${end - start}ms`);

    return answer;
}

function mySolution(answers) {
    const start = performance.now();

    // 수포자 3인 찍는 패턴
    const person1Pattern = [1, 2, 3, 4, 5];
    const person2Pattern = [2, 1, 2, 3, 2, 4, 2, 5];
    const person3Pattern = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    const patterns = [person1Pattern, person2Pattern, person3Pattern];
    
    // 수포자 3인 점수
    const scores = [0, 0, 0];
    
    // 몇 개 맞혔는지 뽑아내는 로직 구현
    patterns.forEach((pattern, patternIdx) => {
        const tempAnswers = [...answers];
        scores[patternIdx] += tempAnswers.filter((answer, answerIdx) => {
            return answer == pattern[answerIdx % pattern.length];
        }).length
    })

    // 점수가 가장 높은 사람 반환
    const answer = scores.map((score, idx) => {
        if (score == Math.max(...scores)) return idx + 1;
    }).filter(value => value);

    const end = performance.now();
    console.log(`mySolution 실행 시간: ${end - start}ms`);
    
    return answer;
}

console.log(mySolution([1, 2, 3, 4, 5]));   // 0.067ms
console.log(bestSolution([1, 2, 3, 4, 5])); // 0.006ms