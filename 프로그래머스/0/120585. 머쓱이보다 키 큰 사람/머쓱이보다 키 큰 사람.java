class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int idx = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                idx = i;
                break;
            } 
        }
        if (idx != -1) answer = array.length - idx;
        return answer;
    }
}