import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // 숫자 입력받고 해당 숫자만큼 입력받는 방법
        int inputCount = kb.nextInt();
        String[] inputs = new String[inputCount];
        for (int i = 0; i < inputCount; i++) {
            inputs[i] = kb.next();
        }

        for (String str: solution2(inputs)) {
            System.out.println(str);
        }
    }

    public static List<String> solution1(String[] strs) {
        List<String> answer = new ArrayList<>();
        for (String str : strs) {
            String reversedStr = new StringBuilder(str).reverse().toString();
            answer.add(reversedStr);
        }
        return answer;
    }

    public static List<String> solution2(String[] strs) {
        List<String> answer = new ArrayList<>();
        for (String str : strs) {
            char[] strLetters = str.toCharArray();
            int lt = 0, rt = strLetters.length - 1;
            // 홀수일 때는 같아질거고, 짝수일 때는 rt가 lt보다 크므로
            while (lt < rt) {
                char tmp = strLetters[lt];
                strLetters[lt] = strLetters[rt];
                strLetters[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(strLetters));
        }
        return answer;
    }
}