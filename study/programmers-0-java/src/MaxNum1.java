// 최댓값 만들기 (1)
// Lv.0

import java.util.Arrays;

public class MaxNum1 {
    public int mySolution(int[] numbers) {
        int answer = 0;
        int first = 0, second = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= first) {
                if (first >= second) second = first;
                first = numbers[i];
            }
            else if (numbers[i] >= second) second = numbers[i];
        }
        answer = first * second;
        return answer;
    }

    public int bestSolution(int[] numbers) {
        int first = numbers[0], second = 0;
        for (int i = 1; i < numbers.length; i++) {
            // 값만 있으면 되니 값 같은 경우 대응 필요x
            if(first < numbers[i]){
                second = first; // 최댓값 바뀌었으니 이전 최댓값은 당연히 두번째 최댓값
                first = numbers[i];
            }else if(second < numbers[i]){
                first = numbers[i];
            }
        }
        return first * second;

        // 추천 x - 정렬은 성능 떨어짐 & 감점당한 사람들도 있다함
//        Arrays.sort(numbers);
//        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
