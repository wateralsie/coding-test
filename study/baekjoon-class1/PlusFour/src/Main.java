import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (kb.hasNextInt()) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            System.out.println(solution(a, b));
        }
        kb.close();
    }

    public static int solution(int a, int b) {
        return a + b;
    }
}