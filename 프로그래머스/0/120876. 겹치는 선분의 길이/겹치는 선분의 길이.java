class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int[] line : lines) {
            min = Math.min(min, line[0]);
            max = Math.max(max, line[1]);
        }

        for (int i = min; i < max; i++) {
            int count = 0;

            for (int[] line : lines) {
                if (line[0] <= i && i + 1 <= line[1]) {
                    count++;
                }
            }

            if (count >= 2) {
                answer++;
            }
        }

        return answer;
    }
}
