import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String sentence = kb.nextLine();    // next(): 단어를 입력받음
//        System.out.println(Main.solution1(sentence));
        System.out.println(Main.solution2(sentence));
    }

    public static String solution1(String sentence) {
        String answer = "";
        int maxLength = Integer.MIN_VALUE;
        String[] words = sentence.split(" ");
        for (String word : words) {
            // 가장 길이가 긴 단어가 여러 개일 경우 가장 앞쪽에 위치한 단어를 답으로 함
            if (word.length() > maxLength) {
                maxLength = word.length();
                answer = word;
            }
        }
        return answer;
    }

    public static String solution2(String sentence) {
        String answer = "";
        int maxLength = Integer.MIN_VALUE, pos;
        // 다 쪼갰으면 종료
        while ((pos = sentence.indexOf(" ")) != -1) {
            String word = sentence.substring(0, pos);
            if (word.length() > maxLength) {
                maxLength = word.length();
                answer = word;
            }
            sentence = sentence.substring(pos + 1);
        }
        // while문에서 마지막 단어 인식하지 못하기 때문에 추가
        if (sentence.length() > maxLength) {
            answer = sentence;
        }
        return answer;
    }
}