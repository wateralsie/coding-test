import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 백준
        // static 메소드에서 인스턴스 메소드 호출하려면 클래스 객체 생성 필수
        // 호출하려는 메소드가 static일 시 별도 객체 생성 필요없음

        // Main T = new Main();
        GetLetterCount glc = new GetLetterCount();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);   // 문자 입력받는 방법

        System.out.println(glc.mySolution(str, c));
    }
}