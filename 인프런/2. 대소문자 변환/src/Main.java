import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(Main.solution2(str));
    }

    public static String solution1(String str) {
        StringBuilder answer = new StringBuilder(); // 문자열 수정할거면 StringBuilder로 쓰기
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer.append(Character.toUpperCase(x));
            } else {
                answer.append(Character.toLowerCase(x));
            }
        }
        return answer.toString();
    }

    // 아스키 코드
    public static String solution2(String str) {
        // 대문자 65~90
        // 소문자 97~122
        StringBuilder answer = new StringBuilder();
        for (char x: str.toCharArray()) {
            if (x >= 65 && x <= 90) {
                answer.append(Character.toLowerCase(x));
            } else if (x >= 97 && x <= 122) {
                answer.append(Character.toUpperCase(x));
            }
        }
        return answer.toString();
    }
}