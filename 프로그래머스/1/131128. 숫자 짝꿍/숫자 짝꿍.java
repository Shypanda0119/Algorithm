class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<X.length(); i++){
            countX[X.charAt(i) - '0']++;
        }
        
        for(int i=0; i<Y.length(); i++){
            countY[Y.charAt(i) - '0']++;
        }
        
        for(int i=9; i>=0; i--){
            if(Math.min(countX[i], countY[i]) != 0) {
                for(int j=0; j<Math.min(countX[i], countY[i]); j++){
                    sb.append(i);
                }
            }
        }
        String answer = sb.toString();
        if(answer.length() == 0) return "-1";
        else if(answer.charAt(0) == '0') return "0";
        return answer;
    }
}