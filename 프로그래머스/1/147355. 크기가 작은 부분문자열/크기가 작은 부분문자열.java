class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int len = p.length();
        long target = Long.parseLong(p);

        for (int i = 0; i <= t.length() - len; i++) {
            long num = Long.parseLong(t.substring(i, i + len));
            if (num <= target) count++;
        }

        return count;
        }
}