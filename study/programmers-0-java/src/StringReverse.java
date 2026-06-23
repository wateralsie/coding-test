// 뒤집힌 문자열
// Lv.0

public class StringReverse {
    public String mySolution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public String bestSolution(String my_string) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string);
        return answer.reverse().toString();

        // 또는 이 한줄
//        return new StringBuilder(my_string).reverse().toString();
    }
}
