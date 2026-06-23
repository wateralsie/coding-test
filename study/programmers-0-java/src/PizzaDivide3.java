// 피자 나눠 먹기 (3)
// Lv.0

public class PizzaDivide3 {
    public int mySolution(int slice, int n) {
        // 정수론
        return (n + (slice - 1)) / slice;
    }

    public int bestSolution(int slice, int n) {
        // 개인적으로 이 방법이 가장 간단하고 이해가 쉬웠음
        return n % slice > 0 ? (n / slice + 1) : (n / slice);
    }
}
