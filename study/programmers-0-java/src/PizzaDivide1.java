// 피자 나눠 먹기 (1)
// Lv.0

public class PizzaDivide1 {
    public int mySolution(int n) {
        if (n % 7 == 0) return n / 7;
        else return n / 7 + 1;
    }

    // 나머지 최댓값을 더하는 방식인데 난 이해를 못했...
    // 하지만 성능 짱 조아질듯
    public int bestSolution(int n) {
        return (n + 6) / 7;
    //        return (n % 7 == 0) ? n/7 : n/7 + 1;
    }
}
