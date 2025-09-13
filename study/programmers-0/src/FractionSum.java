// 분수의 덧셈
// Lv.0

public class FractionSum {
    public int[] mySolution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int i = 2;
        int gcd = 1, denom = 1;

        while (i <= denom1 || i <= denom2) {
            if (denom1 % i == 0 && denom2 % i == 0) gcd = i;
            i++;
        }

       denom = (denom1 * denom2) / gcd;

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

    public int[] bestSolution(int numer1, int denom1, int numer2, int denom2) {
        // 단순 덧셈 후 기약분수 구하기
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = numer1 * denom2;
        int gcd = gcd(numer, denom);

        return new int[]{numer / gcd, denom / gcd};
    }
    // 최대공약수 구하는 함수
    // **유클리드 호제법** 사용 - a와 b의 최대공약수는 b와 (a % b)의 최대공약수와 같다 (단, a > b)
    public int gcd(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return gcd(num2, num1 % num2);
    }
}
