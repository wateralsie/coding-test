import java.util.ArrayList;
import java.util.List;

public class NoSameNumber {
    public int[] mySolution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int prev = -1;

        for (int n: arr) {
            if (n != prev) {
                prev = n;
                answer.add(n);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
