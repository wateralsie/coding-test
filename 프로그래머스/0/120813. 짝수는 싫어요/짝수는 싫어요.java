import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= n; i += 2) {
            temp.add(i);
        }
        answer = temp.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}