class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int odds = 0, evens = 0;
        for (int num: num_list) {
            if (num % 2 == 0) evens++;
            else odds++;
        }
        answer = new int[]{evens, odds};
        return answer;
    }
}