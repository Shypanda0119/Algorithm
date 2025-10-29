import java.util.*;
class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int index = 0; 
        int num;
        while(true){
            if(n == 0) break;
            
            
            num = (int)(n % 10);
            answer[index++] = num;
            n /= 10;
        }
        return answer;
    }
}