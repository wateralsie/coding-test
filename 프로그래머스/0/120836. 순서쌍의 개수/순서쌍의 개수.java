class Solution {
    public int solution(int n) {
        if (n == 1) return 1;
        
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) answer++;
        }
        return answer + 2;
    }
}