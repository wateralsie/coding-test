class Solution {
    public int gcd(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return gcd(num2, num1 % num2);
    }
    public int solution(int n) {
        int totalPizzaSlice = n * 6 / gcd(n, 6);
        return totalPizzaSlice / 6;
    }
}