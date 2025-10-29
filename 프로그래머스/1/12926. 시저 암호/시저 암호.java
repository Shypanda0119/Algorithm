class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer.append(' ');
                continue;
            }
            if (Character.isLowerCase(c)) {
                c = (char) ((c - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(c)) {
                c = (char) ((c - 'A' + n) % 26 + 'A');
            }
            answer.append(c);
        }
        return answer.toString();
    }
}