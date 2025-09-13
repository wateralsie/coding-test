// 세균 증식
// Lv.0

public class BacteriaMultiply {
    public int mySolution(int n, int t) {
        int multiplyValue = 1;
        for (int i = 0; i < t; i++) {
            multiplyValue *= 2;
        }
        return multiplyValue * n;
    }

    public int bestSolution(int n, int t) {
        // 도랏?
        // 비트를 한 칸 왼쪽으로 옮기면 2배가 됨
        return n << t;

        // 정석
//        for(int i = 0; i < t; i++) {
//            n *= 2;
//        }
//        return n;
    }
}
