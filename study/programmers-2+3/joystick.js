/**
 * 
 * @param {string} name 
 * @returns number
 */
function solution(name) {
    const n = name.length;
    let answer = 0;

    for (const c of name) {
        const up = c.charCodeAt(0) - "A".charCodeAt(0); 
        const down = "Z".charCodeAt(0) - c.charCodeAt(0) + 1;
        answer += Math.min(up, down);
    }

    let move = n - 1;

    for (let i = 0; i < n; i++) {
        let next = i + 1;
        while (next < n && name[next] === "A") {
            next++;
        }
        const backtrack = i + i + (n - next);
        move = Math.min(move, backtrack);
    }

    return answer + move;
}


function attempt(name) {
    const makeName = new Array(name.length).fill("A");
    const alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    let pos = 0;
    let count = 0;
    while (makeName.join("") !== name) {
        let diff = name.at(pos).charCodeAt(0) - makeName[pos].charCodeAt(0);
        if (diff === 0) {
            pos++;
            continue;
        }
        if (diff > alphabet.length - diff){
            diff = -(alphabet.length - diff);
        }
        makeName[pos] = name.at(pos);
        count += Math.abs(diff);
        if (makeName.join("") !== name) {
            pos++;
            count++;
        }
    }
    return count;
}


console.log(solution("JEROEN"));
console.log(solution("JAN"));
console.log(solution("WATERALSIE"));