// 피자 나눠 먹기 (2)
// Lv.0

public class PizzaDivide2 {
    public int mySolution(int n) {
        int totalPizzaSlice = n * 6 / gcd(n, 6);
        return totalPizzaSlice / 6;
        // return n / gcd(n, 6);
    }
    // 먼저 실행되는 순서대로 메소드 배치해야 좋음
    public int gcd(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return gcd(num2, num1 % num2);
    }

    public int altSolution(int n) {
        // 성능 면에서는 mySolution이 더 나을듯
        int answer = 1;
        while (true) {
            if (6 * answer % n == 0) break;
            answer++;
        }
        return answer;
    }
}
