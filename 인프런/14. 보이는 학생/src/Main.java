import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = kb.nextInt();
        }
        System.out.println(mySolution(inputs));
    }

    public static int mySolution(int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }
}