// 삼각형의 완성조건 (1)
// Lv.0

import java.util.Arrays;

public class Triangle1 {
    public int mySolution(int[] sides) {
        int max = 0;
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]) max = sides[i];
        }
        if (max < sides[0] + sides[1] + sides[2] - max) return 1;
        else return 2;
    }

    public int bestSolution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }
}
