// 특정 문자 제거하기
// Lv.0

public class RemoveLetter {
    public String bestSolution1(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public String bestSolution2(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++){
            char temp = my_string.charAt(i);
            if (my_string.charAt(i) == letter.charAt(0)) continue;
            answer.append(temp);
        }
        return answer.toString();
    }
}
