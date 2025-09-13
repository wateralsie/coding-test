class Solution {
    public int solution(int n, int t) {
        int multiplyValue = 1;
        for (int i = 0; i < t; i++) {
            multiplyValue *= 2;
        }
        return multiplyValue * n;
    }
}