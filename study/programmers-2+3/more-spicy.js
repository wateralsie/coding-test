import MinHeap from "./algorithm/heap.js";

/**
 *
 * @param {number[]} scoville
 * @param {number} K
 * @returns number
 */
function solution(scoville, K) {
    let answer = 0;
    const heap = new MinHeap();
    scoville.forEach((s) => heap.push(s));
    while (heap.peek < K) {
        if (heap.size < 2) {
            answer = -1;
            break;
        }
        const min = heap.pop();
        const minSecond = heap.pop();
        heap.push(min + minSecond * 2);
        answer++;
    }
    return answer;
}

// 정확성 테스트케이스 일부 (83.9), 효율성 테스트 전부 시간초과
function attempt2(scoville, K) {
    let answer = 0;
    scoville.sort((a, b) => a - b);
    while (scoville[0] < K) {
        if (scoville.length < 2) {
            answer = -1;
            break;
        }
        const min = scoville.shift();
        const minSecond = scoville.shift();
        const idx = scoville.findIndex((s) => s > min + minSecond * 2);
        scoville.splice(idx === -1 ? scoville.length : idx, 0, min + minSecond * 2);
        answer++;
    }
    return answer;
}

// 정확성 테스트케이스 일부 (83.9), 효율성 테스트 전부 시간초과
function attempt1(scoville, K) {
    let answer = 0;
    while (scoville.some((s) => s < K)) {
        if (scoville.length < 2) {
            answer = -1;
            break;
        }
        scoville.sort((a, b) => a - b);
        const min = scoville.shift();
        const minSecond = scoville.shift();
        scoville.unshift(min + minSecond * 2);
        answer++;
    }
    return answer;
}

console.log(solution([1, 2, 3, 9, 10, 12], 7));
