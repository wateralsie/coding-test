// 문자 찾기

public class GetLetterCount {
    public int mySolution(String str, char t) {
        int answer = 0;
        // 대문자 or 소문자로 통일
        str = str.toLowerCase();
        t = Character.toLowerCase(t);
        // 문자열에서 특정 문자의 개수 탐색
        // 1. 인덱스 기준 탐색
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }
        // 2. for-each
        for (char x : str.toCharArray()) {  // 문자 배열 생성
            if (x == t) {
                answer++;
            }
        }

        return answer;
    }
}
