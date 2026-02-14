import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        solution(n);
    }

    public static void solution(int n) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}