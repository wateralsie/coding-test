// 짝수 홀수 개수
// Lv.0

public class OddsEvensCount {
    public int[] mySolution(int[] num_list) {
        int[] answer = {};
        int odds = 0, evens = 0;
        for (int num: num_list) {
            if (num % 2 == 0) evens++;
            else odds++;
        }
        answer = new int[]{evens, odds};
        return answer;
    }

    public int[] bestSolution(int[] num_list) {
        int[] answer = new int[2];
        for (int num: num_list) {
            // 짝수이면 0, 홀수이면 1번 인덱스 값 증가
            // 새로운 시각을 제시해줘서 넣어봤음
            answer[num % 2]++;
        }
        return answer;
    }
}
