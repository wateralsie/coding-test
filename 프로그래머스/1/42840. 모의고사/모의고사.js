function solution(answers) {
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
    return scores.map((score, idx) => {
        if (score == Math.max(...scores)) return idx + 1;
    }).filter(value => value);
}