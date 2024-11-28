class Solution {
    public int solution(int a, int b) {
            int answer;
        String aFbL = Integer.toString(a) + Integer.toString(b);
        String aLbF = Integer.toString(b) + Integer.toString(a);
        if(Integer.valueOf(aFbL) > Integer.valueOf(aLbF)){
            answer = Integer.valueOf(aFbL);
        }else {
            answer = Integer.valueOf(aLbF);
        }
        return answer;
    }
}
