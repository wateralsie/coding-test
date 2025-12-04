import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
//        String[] input = kb.next().replace(" ", ",").split(",");
//        String s = input[0];
//        String t = input[1].charAt(0);
        // 입력값이 공백으로 구분될 때 이렇게 입력받으면 됨
        String s = kb.next();
        char t = kb.next().charAt(0);
        System.out.println(Arrays.stream(solution(s, t))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }

    // String -> char 변환방법을 몰라서 막힘 - charAt(0)
    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int d = 1000;    // 초기값 설정은 매우 크게
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) d = 0;
            else d++;
            answer[i] = d;
        }
        d = 1000;
        // 더 가까운 t가 있을 수 있으므로 역순으로 반복해줌
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) d = 0;
            else d++;
            answer[i] = Math.min(answer[i], d); // 두 수 중 작은값 구할때 사용
        }
        return answer;
    }
}