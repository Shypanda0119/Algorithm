class Solution {
    public int solution(String s) {
        int answer = 0;

        while(!s.isEmpty()) {
            char x = s.charAt(0);
            int xCount = 0;
            int otherCount = 0;
            boolean split = false;
            int i;

            for(i = 0; i < s.length(); i++) {
                if(s.charAt(i) == x) xCount++;
                else otherCount++;

                if(xCount == otherCount) {
                    answer++;
                    split = true;
                    break;
                }
            }

            if(split) {
                s = s.substring(i + 1); 
            } else {
                answer++;
                break;
            }
        }

        return answer;
    }
}
