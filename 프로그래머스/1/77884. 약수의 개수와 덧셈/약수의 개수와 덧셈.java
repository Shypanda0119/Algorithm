import java.util.*;
class Solution {
    public int solution(int left, int right) {
        int num = 1;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        while(true){
            if(Math.pow(num, 2) >= left && Math.pow(num, 2) <= right) list.add(num);
            else if(Math.pow(num, 2) > right) break;
            num++;
        }
        
        for(int i =left; i<=right; i++){
            sum += i;
        }
        
        for(int k : list){
            sum -= Math.pow(k, 2) * 2;
        }
        
        return sum;
    }
}