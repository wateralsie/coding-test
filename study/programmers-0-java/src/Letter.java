// 편지
// Lv.0

public class Letter {
    public int mySolution(String message) {
        int answer = 0;
        answer += message.length() * 2;
        return answer;
    }

    // 매직넘버 방지하기 위함 - 의미있는 이름의 상수로 대체될 수 있는 숫자 (각자 다른 의미로 해석할 수 있음)
    final static int WORD_WIDTH = 2;
    public int bestSolution(String message) {
        return message.length() * WORD_WIDTH;
    }
}
