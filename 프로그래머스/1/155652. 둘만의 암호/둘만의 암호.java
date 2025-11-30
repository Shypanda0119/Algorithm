import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) skipSet.add(c);

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int count = 0;
            char cur = ch;

            while (count < index) {
                cur++;
                if (cur > 'z') cur = 'a';

                if (!skipSet.contains(cur)) {
                    count++;
                }
            }
            sb.append(cur);
        }

        return sb.toString();
    }
}
