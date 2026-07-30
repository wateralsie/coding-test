// queue

/**
 * 
 * @param {number[]} progresses 
 * @param {number[]} speeds 
 * @returns number[]
 */
function solution(progresses, speeds) {
    let answer = [];
    const daysToComplete = progresses.map((progress, idx) => {
        return Math.ceil((100 - progress) / speeds[idx]);
    })

    let head = 0;
    let longestFeature = daysToComplete[head];
    let releaseFeatureCount = 1;

    while (head < daysToComplete.length - 1) {
        if (longestFeature < daysToComplete[++head]) {
            answer.push(releaseFeatureCount);
            longestFeature = daysToComplete[head];
            releaseFeatureCount = 1;
        } else {
            releaseFeatureCount++;
        }
    }
    answer.push(releaseFeatureCount);
    return answer;
}

/**
 * 
 * @param {number[]} progresses 
 * @param {number[]} speeds 
 * @returns number[]
 */
function betterSolution(progresses, speeds) {
    const answer = [];
    let currentReleaseDay = 0;
    let currentGroupCount = 0;

    for (let i = 0; i < progresses.length; i++) {
        const daysToComplete = Math.ceil((100 - progresses[i]) / speeds[i]);

        if (daysToComplete <= currentReleaseDay) {
            currentGroupCount++;
        } else {
            if (currentGroupCount > 0) answer.push(currentGroupCount);
            currentReleaseDay = daysToComplete;
            currentGroupCount++;
        }
    }
    answer.push(currentGroupCount);
    return answer;
}

/**
 * 
 * @param {number[]} progresses 
 * @param {number[]} speeds 
 * @returns number[]
 */
function anotherSolution(progresses, speeds) {
    let answer = [0];
    let days = progresses.map((progress, index) => Math.ceil((100 - progress) / speeds[index]));
    let maxDay = days[0];

    for(let i = 0, j = 0; i< days.length; i++){
        if(days[i] <= maxDay) {
            answer[j] += 1;
        } else {
            maxDay = days[i];
            answer[++j] = 1;
        }
    }

    return answer;
}


console.log(anotherSolution([93, 30, 55], [1, 30, 5]));
console.log(anotherSolution([95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1]));