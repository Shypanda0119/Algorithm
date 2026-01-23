class Solution {
    public int solution(String[] babbling) {
        String[] sounds = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            int idx = 0;
            String prev = "";

            while (idx < word.length()) {
                boolean matched = false;

                for (String s : sounds) {
                    if (word.startsWith(s, idx) && !s.equals(prev)) {
                        idx += s.length();
                        prev = s;
                        matched = true;
                        break;
                    }
                }

                if (!matched) break;
            }

            if (idx == word.length()) answer++;
        }

        return answer;
    }
}
