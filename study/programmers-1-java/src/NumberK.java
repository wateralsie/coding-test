import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        for (int[] command: commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            List<Integer> sliced = new ArrayList<>();
//            int[] sliced = new int[j - i + 1];
            for (int n = i - 1; n < j; n++) {
                sliced.add(array[n]);
            }
            Arrays.sort(sliced.toArray());
            answer[0] = sliced.get(k - 1);
        }
        return answer;
    }
}
