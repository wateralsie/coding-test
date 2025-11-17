import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        System.out.println(lectureSolution2(input));
    }

    // 151ms
    public static String mySolution(String str) {
        String answer = "";
        char[] strLetters = str.toLowerCase().toCharArray();
        for (int i = 0; i < strLetters.length / 2; i++) {
            if (strLetters[i] != strLetters[strLetters.length - 1 - i]) {
                answer = "NO";
                break;
            }
        }
        if (answer.isEmpty()) answer = "YES";
        return answer;
    }

    // 141ms
    public static String lectureSolution(String str) {
        String answer = "YES";
        int length = str.length();
        str = str.toLowerCase();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return "NO";
            }
        }
        return answer;
    }

    // 159ms
    public static String lectureSolution2(String str) {
        String answer = "";
        StringBuilder tmp = new StringBuilder(str);
        if (str.equalsIgnoreCase(tmp.reverse().toString())) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }
}