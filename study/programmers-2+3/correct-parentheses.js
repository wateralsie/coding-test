// stack

/**
 * 
 * @param {string} s 
 * @returns boolean
 */
function solution(s) {
    const stack = [];
    for (const p of s) {
        if (p === ")") {
            if (stack.length === 0) return false;
            stack.pop();
        } else {
            stack.push(p);
        }
    }
    return stack.length === 0;
}

/**
 * 
 * @param {string} s 
 * @returns boolean
 */
function anotherSolution(s){
    let open = 0;
    for (const p of s) {
        open += (p === "(" ? 1 : -1);
        if (open < 0) return false;
    }
    return open === 0;
}

console.log(solution("()()"));
console.log(solution("(())()"));
console.log(solution(")()("));
console.log(solution("(()("));