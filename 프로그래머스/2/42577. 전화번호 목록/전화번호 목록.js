function solution(phone_book) {
    const tempPhoneBook = [...phone_book].sort();
    for (let i = 0; i < tempPhoneBook.length - 1; i++) {
        if(tempPhoneBook[i+1].startsWith(tempPhoneBook[i])) return false;
    }
    return true;
}