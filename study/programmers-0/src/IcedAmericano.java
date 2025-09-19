// 아이스 아메리카노
// Lv.0

public class IcedAmericano {
    public int[] mySolution(int money) {
        // 배열 선언 방법 몰라서 ai 참고..
        return new int[] {money / 5500, money % 5500};
    }

    public int[] otherSolution(int money) {
        // 정석 - 원래 의도했던 방식
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        
        return answer;
    }
}
