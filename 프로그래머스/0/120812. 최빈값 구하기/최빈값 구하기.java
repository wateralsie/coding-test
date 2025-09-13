class Solution {
    public int solution(int[] array) {
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
}