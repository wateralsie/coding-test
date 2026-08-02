function solution(s){
    const stack = [];

    for (const p of s) {
        if (p === ")") {
            if (stack.length > 0) stack.pop();
            else return false;
        } else {
            stack.push(p);
        }
    }

    return stack.length === 0;
}