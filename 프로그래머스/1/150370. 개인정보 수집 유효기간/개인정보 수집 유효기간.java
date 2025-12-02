import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] todayArr = today.split("\\.");
        int todaySum = (Integer.parseInt(todayArr[0]) * 12 * 28) + (Integer.parseInt(todayArr[1]) * 28) + Integer.parseInt(todayArr[2]);
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int idx = 1;
        for(String term : terms){
            String[] str = term.split(" ");
            String alphabet = str[0];
            int month = Integer.parseInt(str[1]);
            map.put(alphabet, month);
        }
        
        for(String privacy : privacies){
            String[] str = privacy.split(" ");
            String[] arr = str[0].split("\\.");
            int privacySum = (Integer.parseInt(arr[0]) * 12 * 28) + (Integer.parseInt(arr[1]) * 28) + (Integer.parseInt(arr[2])) + (map.get(str[1]) * 28 -1);
            
            if(todaySum > privacySum) list.add(idx);
            idx++;
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}