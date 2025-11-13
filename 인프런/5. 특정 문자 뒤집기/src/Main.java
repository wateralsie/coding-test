import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer;
        char[] strLetters = str.toCharArray();
        int lt = 0, rt = strLetters.length - 1;
        while (lt < rt) {
            // 특수문자인지 확인
            if (!Character.isAlphabetic(strLetters[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(strLetters[rt])) {
                rt--;
            } else {
                char tmp = strLetters[lt];
                strLetters[lt] = strLetters[rt];
                strLetters[rt] = tmp;
                lt++;
                rt--;
            }
        }
        // 배열의 요소를 String 형태로 나열
        // [S, #, T] -> S#T
        answer = String.valueOf(strLetters);
        return answer;
    }
}