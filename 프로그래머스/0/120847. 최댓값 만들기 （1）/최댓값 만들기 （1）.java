class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int first = 0, second = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= first) {
                if (first >= second) second = first;
                first = numbers[i];
            }
            else if (numbers[i] >= second) second = numbers[i];
        }
        answer = first * second;
        return answer;
    }
}