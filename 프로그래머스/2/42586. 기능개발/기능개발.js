function solution(progresses, speeds) {
    let answer = [];
    const daysToComplete = progresses.map((progress, idx) => {
        return Math.ceil((100 - progress) / speeds[idx]);
    })

    let head = 0;
    let releaseFeatureNum = 1;
    let longestFeature = daysToComplete[head];
    
    while (head < daysToComplete.length - 1) {
        if (longestFeature < daysToComplete[++head]) {
            answer.push(releaseFeatureNum);
            longestFeature = daysToComplete[head];
            releaseFeatureNum = 1;
        } else {
            releaseFeatureNum++;
        }
    }
    answer.push(releaseFeatureNum);
    return answer;
}