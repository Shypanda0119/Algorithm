import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        List<Integer> arrList = new ArrayList<>(); 
        for(int i=0; i<arr.length; i++){
            arrList.add(arr[i]);
        }
        arrList.remove(Collections.min(arrList));
        int[] answer = new int[arr.length-1];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
} 