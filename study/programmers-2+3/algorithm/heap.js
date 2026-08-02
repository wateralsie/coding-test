export default class MinHeap {
    #heap; 

    constructor() {
        this.#heap = [];
    }

    get peek() {
        return this.#heap[0];
    }

    get size() {
        return this.#heap.length;
    }

    push(x) {
        this.#heap.push(x);
        let curIdx = this.#heap.length - 1;
        while (curIdx > 0) {
            const parentIdx = this.#getParentIdx(curIdx);
            if (this.#heap[curIdx] >= this.#heap[parentIdx]) break;
            this.#swap(curIdx, parentIdx);
            curIdx = parentIdx;
        }
    }

    pop() {
        const top = this.#heap[0];
        const last = this.#heap.pop();

        if (this.#heap.length > 0) {
            this.#heap[0] = last;
            let curIdx = 0;

            while (true) {
                const [leftIdx, rightIdx] = this.#getChildIdx(curIdx);
                let smallestIdx = curIdx;
                if (leftIdx < this.#heap.length && this.#heap[leftIdx] < this.#heap[smallestIdx]) {
                    smallestIdx = leftIdx;
                }
                if (rightIdx < this.#heap.length && this.#heap[rightIdx] < this.#heap[smallestIdx]) {
                    smallestIdx = rightIdx;
                }
                if (smallestIdx === curIdx) break;
                this.#swap(curIdx, smallestIdx);
                curIdx = smallestIdx;
            }
        }
        return top;
    }

    #swap(idx1, idx2) {
        [this.#heap[idx1], this.#heap[idx2]] = [this.#heap[idx2], this.#heap[idx1]];
    }

    #getParentIdx(childIdx) {
        return Math.floor((childIdx - 1) / 2);
    }

    #getChildIdx(parentIdx) {
        const left = 2 * parentIdx + 1;
        const right = 2 * parentIdx + 2;
        return [left, right];
    }
}
