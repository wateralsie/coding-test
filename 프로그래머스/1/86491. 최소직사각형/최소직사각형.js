function solution(sizes) {
    let answer = 0;
    let lw = 0, lh = 0;
    sizes.forEach(size => {
        let w = 0, h = 0;
        if (size[0] < size[1]) {
            w = size[1];
            h = size[0];
        } else {
            w = size[0];
            h = size[1];
        }
        if (lw < w) lw = w;
        if (lh < h) lh = h;
    });
    answer = lw * lh;
    return answer;
}