// 짝수는 싫어요
// Lv.0

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class HateEvens {
    // 몰라서 자동완성, ai 동원해서 풀었음 - 스트림 이용하여 ArrayList -> int[], 리스트 선언 방식
    public int[] mySolution(int n) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= n; i += 2) {
            temp.add(i);
        }
        answer = temp.stream().mapToInt(x -> x).toArray();
        return answer;
    }

    public int[] bestSolution(int n) {
        // 그냥 스트림 쓰는거 연습하고 싶어서...
        // 위쪽 내 방식으로 하면 될듯
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 1).toArray();
    }
}
