// 머쓱이보다 키 큰 사람
// Lv.0

public class TallerCount {
    public int mySolution(int[] array, int height) {
        int answer = 0;
        int idx = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                idx = i;
                break;
            }
        }
        if (idx != -1) answer = array.length - idx;
        return answer;
    }
    
    public int bestSolution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if (i > height) answer++;
        }
        return answer;
    }
}
