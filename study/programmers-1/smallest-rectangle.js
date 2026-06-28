function mySolution(sizes) {
    const start = performance.now();
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
    const end = performance.now();
    console.log(`실행 시간: ${end - start}ms`);
    return answer;
}

function anotherSolution(sizes) {
    const start = performance.now();
    const rotated = sizes.map(([w, h]) => w < h ? [h, w] : [w, h]);
    let maxSize = [0, 0];
    rotated.forEach(([w, h]) => {
        if (w > maxSize[0]) maxSize[0] = w;
        if (h > maxSize[1]) maxSize[1] = h;
    });
    const end = performance.now();
    console.log(`실행 시간: ${end - start}ms`);
    return maxSize[0] * maxSize[1];
}

console.log(mySolution([[60, 50], [30, 70], [60, 30], [80, 40]]));
console.log(mySolution([[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]));
console.log(mySolution([[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]));

console.log(anotherSolution([[60, 50], [30, 70], [60, 30], [80, 40]]));
console.log(anotherSolution([[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]));
console.log(anotherSolution([[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]));