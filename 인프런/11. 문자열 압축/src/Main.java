import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        System.out.println(mySolution(input));
    }

    public static String mySolution(String str) {
        StringBuilder sb = new StringBuilder();
        int repeatCount = 1;
        char prev = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == prev) repeatCount++;
            else {
                prev = str.charAt(i);
                if (repeatCount != 1) {
                    sb.append(repeatCount);
                    repeatCount = 1;
                }
                sb.append(str.charAt(i));
            }
        }
        if (repeatCount != 1) sb.append(repeatCount);

        return sb.toString();
    }

    public static String lectureSolution(String str) {
        String answer = "";
        str = str + " ";
        int repeatCount = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) repeatCount++;
            else {
                answer += str.charAt(i);
                if (repeatCount > 1) answer += String.valueOf(repeatCount);
                repeatCount = 1;
            }
        }
        return answer;
    }
}