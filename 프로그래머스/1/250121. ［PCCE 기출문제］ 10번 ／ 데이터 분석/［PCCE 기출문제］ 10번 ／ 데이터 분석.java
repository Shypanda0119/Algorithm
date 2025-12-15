import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = new HashMap<>();
        List<int []> list = new ArrayList<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        for(int i=0; i<data.length; i++){
            if((data[i][map.get(ext)]) < val_ext){
                list.add(data[i]);
            }
        }
        int sortIndex = map.get(sort_by);
        list.sort((a, b) -> Integer.compare(a[sortIndex], b[sortIndex]));
        
        int[][] answer = new int[list.size()][4];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}