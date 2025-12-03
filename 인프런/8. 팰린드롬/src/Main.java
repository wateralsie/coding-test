import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String str) {
        String answer = "NO";
        str = str.toLowerCase().replaceAll("[^a-z]", "");    // 소문자 알파벳이 아닌 경우 빈 문자열로 대체
        String strReversed = new StringBuilder(str).reverse().toString();
        if (str.equals(strReversed)) answer = "YES";
        return answer;
    }
}