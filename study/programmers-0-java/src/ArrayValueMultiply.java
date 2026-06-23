// 배열 두배 만들기
// Lv.0

import java.util.Arrays;

public class ArrayValueMultiply {
    public int[] mySolution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;

        // 이것도 고민했지만 i 변수 선언이 깔끔하지 않다고 생각함
//        int i = 0;
//        for (int num: numbers) {
//            answer[i] = num * 2;
//            i++;
//        }
//        return answer;
    }

    public int[] bestSolution(int[] numbers) {
        // 좀 복잡한 코드이거나 굳이 필요없을때는 비추 - 성능 하락 요인
        return Arrays.stream(numbers).map(x -> x * 2).toArray();

        // 정석
//        for (int i = 0; i < numbers.length; i++) numbers[i] *= 2;
//        return numbers;
    }
}
