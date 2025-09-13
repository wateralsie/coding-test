// 중앙값 구하기
// Lv.0

import java.util.Arrays;

public class Middle {
    public int mySolution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
    // 정렬 알고리즘은 이후에 공부해보는걸로
}
