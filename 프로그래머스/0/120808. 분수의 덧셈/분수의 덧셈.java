class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int i = 2;
        int gcd = 1, denom = 1;

        while (i <= denom1 || i <= denom2) {
            if (denom1 % i == 0 && denom2 % i == 0) gcd = i;
            i++;
        }
        
        if (gcd == 1) denom = denom1 * denom2;
        else denom = (denom1 * denom2) / gcd;
        
        int numerSum = numer1 * (denom / denom1) + numer2 * (denom / denom2);
        
        i = 2;
        gcd = 1;
        while (i <= numerSum || i <= denom) {
            if (numerSum % i == 0 && denom % i == 0) gcd = i;
            i++;
        }
        
        answer = new int[]{numerSum / gcd, denom / gcd};
        
        return answer;
    }
}