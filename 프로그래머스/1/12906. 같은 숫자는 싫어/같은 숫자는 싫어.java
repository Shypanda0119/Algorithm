import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numList = new ArrayList<>();
              
        int prev = -1; 
        for (int num : arr) {
            if (num != prev) {
                numList.add(num);
                prev = num;
            }
        }
        int[] numArr = new int[numList.size()];
        for(int i=0; i<numList.size(); i++){
            numArr[i] = numList.get(i);         
        }
        return numArr;
    }
}