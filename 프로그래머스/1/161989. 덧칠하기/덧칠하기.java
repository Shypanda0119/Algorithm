class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;        
        int paintedEnd = 0;  

        for (int sec : section) {
            if (sec <= paintedEnd) continue;
            count++;
            paintedEnd = sec + m - 1;
        }
        return count;
    }
}
