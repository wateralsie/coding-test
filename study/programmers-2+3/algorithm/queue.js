const queue = [];
let head = 0;

// 추가 (enqueue)
queue.push(item);
// 제거 (dequeue) — shift() 대신 포인터 이동
const item = queue[head++];
// 앞 원소 확인 (peek)
const front = queue[head];
// 비었는지 확인
const isEmpty = head >= queue.length;
// 남은 크기
const size = queue.length - head;

/************* */

queue.push(start);        // 초기값 넣기

while (head < queue.length) {   // 큐가 빌 때까지
    const cur = queue[head++];  // 꺼내기

    // cur 처리...
    // 조건 맞으면 queue.push(next) 로 새 원소 추가
}