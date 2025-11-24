import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> number = new Stack<>();
        int count = 0;
        for(int k : ingredient){
            number.push(k);
            if(number.size() >= 4){
                if(number.get(number.size()-1) == 1 && number.get(number.size()-2) == 3
                    && number.get(number.size()-3) == 2 && number.get(number.size()-4)                      == 1){
                    count++;
                    for(int i=0; i<4; i++){
                        number.pop();
                    }
                }
            }
        }
        return count;
    }
}