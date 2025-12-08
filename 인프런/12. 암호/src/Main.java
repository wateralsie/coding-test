import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
//        int letterCount = Integer.parseInt(kb.nextLine());
        int letterCount = kb.nextInt();
        // letterCount 입력 후 친 엔터가 버퍼에 남아있어서 nextLine()은 바로 빈 문자열을 읽음 -> 따로 입력받지 않아 오류 발생
//        String code = kb.nextLine();
        String code = kb.next();
        System.out.println(mySolution(letterCount, code));
    }

    public static String mySolution(int letterCount, String code) {
        String answer = "";
        code = code.replace("#", "1").replace("*", "0");
        for (int i = 0; i < letterCount; i++) {
            int multiply = 64;
            char letter = ' ';
            for (int j = i * 7; j < (i+1) * 7; j++) {
                letter += (char) (Integer.parseInt(String.valueOf(code.charAt(j))) * multiply);
                multiply /= 2;
            }
            answer += letter;
        }
        return answer.toUpperCase();
    }

    public static String lectureSolution(int letterCount, String code) {
        String answer = "";
        for (int i = 0; i < letterCount; i++) {
            String binary = code.substring(0, 7).replace('#', '1').replace('*', '0');
            // 2진수 형태의 문자열 -> 10진수
            char letter = (char) Integer.parseInt(binary, 2);
            answer += letter;
            code = code.substring(7);
        }
        return answer;
    }
}