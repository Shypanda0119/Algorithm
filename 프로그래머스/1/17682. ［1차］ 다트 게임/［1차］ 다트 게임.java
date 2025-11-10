class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int idx = 0;
        int answer = 0;
        for(int i=0; i<dartResult.length(); i++){
            if(dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0'){
                score[idx] = 10;
                i++;
            }
            else if(dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9'){
                score[idx]  = dartResult.charAt(i) - '0';          
            }
            if (dartResult.charAt(i) == 'S' || dartResult.charAt(i) == 'D' || dartResult.charAt(i) == 'T') {
                if (dartResult.charAt(i) == 'D') score[idx] = (int)Math.pow(score[idx], 2);
                else if (dartResult.charAt(i) == 'T') score[idx] = (int)Math.pow(score[idx], 3);
                idx++;
            }
            
            if(dartResult.charAt(i) == '*') {
                score[idx - 1] *= 2;
                if(idx - 2 >= 0) score[idx - 2] *= 2;
            }else if(dartResult.charAt(i) == '#') score[idx - 1] *= -1;
            
        }
        for(int n : score){ 
            answer += n;
        }
        return answer;
    }
}