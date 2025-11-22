import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int n = score.length;
        int result = 0;
        int idx = n - m;
        while (idx >= 0) {
            result += score[idx] * m;
            idx -= m;
        }
        return result;
    }
}
