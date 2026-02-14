import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b) {
        if (a > b) {
            return ">";
        }
        if (a < b) {
            return "<";
        }
        return "==";
    }
}