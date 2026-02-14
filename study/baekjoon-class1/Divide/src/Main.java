import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println(solution(a, b));
    }

    public static double solution(int a, int b) {
        return (double)a / b;
    }
}