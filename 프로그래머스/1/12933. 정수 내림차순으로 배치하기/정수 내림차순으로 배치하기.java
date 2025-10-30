import java.util.*;

class Solution {
    public long solution(long n) {
        String num = String.valueOf(n);
        Integer[] nArr = new Integer[num.length()];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<nArr.length; i++){
            nArr[i] = num.charAt(i) - '0'; 
        }
        
        Arrays.sort(nArr, Collections.reverseOrder());
        
        for(int i=0; i<nArr.length; i++){
            sb.append(nArr[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}