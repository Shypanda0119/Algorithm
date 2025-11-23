class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String b : babbling) {
            String prev = "";
            String temp = b;
            boolean ok = true;

            while (temp.length() > 0) {
                boolean matched = false;
                for (String w : words) {
                    if (temp.startsWith(w) && !prev.equals(w)) {
                        prev = w;
                        temp = temp.substring(w.length());
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    ok = false;
                    break;
                }
            }
            if (ok) count++;
        }
        return count;
    }
}
