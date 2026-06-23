// 최빈값 구하기
// Lv.0

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    // 몰라서 ai 동원해서 풀었음 - 왜 안되는지만 물어봄
    public int mySolution(int[] array) {
        int[] count = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) count[j]++;
            }
            count[i]++;
        }

        int answerIndex = 0;    // array에서 최빈값 있는 위치
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[answerIndex]) answerIndex = i;
        }

        for (int i = 0; i < count.length; i++) {
            if (i != answerIndex && count[i] == count[answerIndex]) {
                return -1;
            }
        }

        return array[answerIndex];
    }

    public int bestSolution(int[] array) {
        int answer = 0;
        int maxCount = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num: array) {
            // getOrDefault: 키와 대응되는 값을 반환하거나 키가 없으면 defaultValue
            int count = countMap.getOrDefault(num, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
                answer = num;
            }
            else if (count == maxCount) {
                answer = -1;
            }
            countMap.put(num, count);
        }
        return answer;
    }
}