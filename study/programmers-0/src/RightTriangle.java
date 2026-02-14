public class RightTriangle {
    public String mySolution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String bestSolution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            // repeat
            // 시간 복잡도는 이중 반복문과 동일 (O(n^2))
            // 실행 속도 (n=1000): repeat - 1,904,167ns, 이중 반복문 - 10,340,958ns
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    // main에서 그대로 출력해버리기
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=1; i<=n; i++){
//            System.out.println("*".repeat(i));
//        }
//    }
}
