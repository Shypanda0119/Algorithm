class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int t = 0; t < targets.length; t++) {
            String target = targets[t];
            int sum = 0; 
            boolean impossible = false;

            for (int i = 0; i < target.length(); i++) {
                char c = target.charAt(i);
                int min = Integer.MAX_VALUE;

                for (String key : keymap) {
                    int idx = key.indexOf(c);
                    if (idx != -1) {
                        min = Math.min(min, idx + 1);
                    }
                }

                if (min == Integer.MAX_VALUE) {
                    impossible = true;
                    break;
                }

                sum += min;
            }

            answer[t] = impossible ? -1 : sum;
        }

        return answer;
    }
}
