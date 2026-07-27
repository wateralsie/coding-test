/**
 * 
 * @param {string[]} phone_book 
 */
function solution(phone_book) {
    const tempPhoneBook = [...phone_book].sort();
    for (let i = 0; i < tempPhoneBook.length - 1; i++) {
        if(tempPhoneBook[i+1].startsWith(tempPhoneBook[i])) return false;
    }
    return true;
}

/**
 * 
 * @param {string[]} phone_book 
 */
function hashSolution(phone_book) {
    const tempPhoneBook = new Set(phone_book);
    for (let num of tempPhoneBook) {
        for (let i = 1; i < num.length; i++) {
            if (tempPhoneBook.has(num.slice(0, i))) return false;
        }
    }
    return true;
}

/**
 * 
 * @param {string[]} phone_book 
 */
function anotherSolution(phone_book) {
    const tempPhoneBook = [...phone_book].sort();
    return !tempPhoneBook.some((_, i)=> {
        if (i === tempPhoneBook.length - 1) return false;
        return tempPhoneBook[i+1].startsWith(tempPhoneBook[i]);
    })
}

// 효율성 테스트 3, 4에서 시간초과
function attempt1(phone_book) {
    for (let i = 0; i < phone_book.length; i++) {
        const iStartingNum = phone_book.filter(p => {
            return p !== phone_book[i] && p.startsWith(phone_book[i]);
        });
        if (iStartingNum.length > 0) return false;
    }
    return true;
}

console.log(hashSolution(["119", "97674223", "1195524421"]));
console.log(hashSolution(["123","456","789"]));
console.log(hashSolution(["12","123","1235","567","88"]));