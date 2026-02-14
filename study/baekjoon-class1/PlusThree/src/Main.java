import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        int[] answer = new int[t];
        for (int i = 0; i < t; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            answer[i] = solution(a, b);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int solution(int a, int b) {
        return a + b;
    }
}