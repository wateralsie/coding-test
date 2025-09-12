class Solution {
    public int solution(int n) {
        int sum = 0;
        if (n == 1) return sum;
        
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}