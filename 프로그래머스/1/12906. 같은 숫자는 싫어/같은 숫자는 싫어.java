import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
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