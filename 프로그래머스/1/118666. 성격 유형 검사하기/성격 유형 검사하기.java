import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> score = new HashMap<>();
        char[] types = {'R','T','C','F','J','M','A','N'};
        for (char c : types) score.put(c, 0);

        for (int i = 0; i < survey.length; i++) {
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            int diff = choices[i] - 4;

            if (diff < 0) {
                score.put(left, score.get(left) + Math.abs(diff));
            } else if (diff > 0) {
                score.put(right, score.get(right) + diff);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(score.get('R') >= score.get('T') ? 'R' : 'T');
        sb.append(score.get('C') >= score.get('F') ? 'C' : 'F');
        sb.append(score.get('J') >= score.get('M') ? 'J' : 'M');
        sb.append(score.get('A') >= score.get('N') ? 'A' : 'N');

        return sb.toString();
    }
}
