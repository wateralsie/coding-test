function solution(arr)
{
    const answer = [];
    arr.forEach(a => {
        if (answer.at(-1) === a) return;
        answer.push(a);
    })
    return answer;
}