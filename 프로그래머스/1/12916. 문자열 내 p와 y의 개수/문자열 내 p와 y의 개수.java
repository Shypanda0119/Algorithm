class Solution {
    boolean solution(String s) {
        int sumP = 0;
        int sumY = 0;
        
        s = s.toUpperCase();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'P'){
                sumP++;
            }
            if(s.charAt(i) == 'Y'){
                sumY++;
            }
        }
        if(sumP == sumY) return true;
        return false;
    }
}