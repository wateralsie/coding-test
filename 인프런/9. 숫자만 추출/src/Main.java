import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        System.out.println(lectureSolution(input));
    }

//    public static int mySolution(String str) {
//        int answer = 0;
//        answer = Integer.parseInt(str.replace("[^0-9]", ""));   // 문자열 형태의 숫자이기 때문에 replace로 못 잡아냄
//        return answer;
//    }

    public static int lectureSolution(String str) {
        int answer = 0;
        for (char c : str.toCharArray()) {
            // 숫자의 아스키 코드
            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }
        return answer;
    }

    public static int lectureSolution2(String str) {
        int answer = 0;
        StringBuilder onlyNumber = new StringBuilder();
        for (char c : str.toCharArray()) {
            // Character.isDigit(c) 도 가능
            if (c >= 48 && c <= 57) onlyNumber.append(c);
        }
        answer = Integer.parseInt(onlyNumber.toString());
        return answer;
    }
}