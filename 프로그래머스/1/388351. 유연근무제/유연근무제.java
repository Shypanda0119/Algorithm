class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            boolean ok = true;

            int limit = toMinute(schedules[i]) + 10;

            for (int d = 0; d < 7; d++) {
                int day = (startday + d - 1) % 7 + 1;
                if (day == 6 || day == 7) continue;

                int log = toMinute(timelogs[i][d]);
                if (log > limit) {
                    ok = false;
                    break;
                }
            }

            if (ok) answer++;
        }

        return answer;
    }

    int toMinute(int time) {
        return (time / 100) * 60 + (time % 100);
    }
}
