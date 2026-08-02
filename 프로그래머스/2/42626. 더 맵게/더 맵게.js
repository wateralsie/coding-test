class MinHeap {
    constructor() {
        this.heap = [];
    }

    push(x) {
        this.heap.push(x);
        let i = this.heap.length - 1;
        while (i > 0) {
            const parent = Math.floor((i - 1) / 2);
            if (this.heap[parent] <= this.heap[i]) break;
            [this.heap[parent], this.heap[i]] = [this.heap[i], this.heap[parent]];
            i = parent;
        }
    }

    pop() {
        const top = this.heap[0];
        const last = this.heap.pop();
        if (this.heap.length > 0) {
            this.heap[0] = last;
            let i = 0;
            const n = this.heap.length;
            while (true) {
                const left = 2 * i + 1;
                const right = 2 * i + 2;
                let smallest = i;
                if (left < n && this.heap[left] < this.heap[smallest]) smallest = left;
                if (right < n && this.heap[right] < this.heap[smallest]) smallest = right;
                if (smallest === i) break;
                [this.heap[i], this.heap[smallest]] = [this.heap[smallest], this.heap[i]];
                i = smallest;
            }
        }
        return top;
    }

    get size() {
        return this.heap.length;
    }
}


function solution(scoville, K) {
    let answer = 0;
    const heap = new MinHeap();
    scoville.forEach(s => heap.push(s));
    while (heap.heap[0] < K) {
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