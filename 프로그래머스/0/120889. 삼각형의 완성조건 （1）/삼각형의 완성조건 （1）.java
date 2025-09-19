class Solution {
    public int solution(int[] sides) {
        int max = 0;
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]) max = sides[i];
        }
        if (max < sides[0] + sides[1] + sides[2] - max) return 1;
        else return 2;
    }
}