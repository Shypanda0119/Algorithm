import java.util.*;

class Solution {
    public String solution(String s) {
        List<Character> lowerList = new ArrayList<>();
        List<Character> upperList = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') lowerList.add(s.charAt(i));
            else upperList.add(s.charAt(i));
        }
        Collections.sort(lowerList, Collections.reverseOrder());
        Collections.sort(upperList, Collections.reverseOrder());
        
        for(int i=0; i<upperList.size(); i++){
            lowerList.add(upperList.get(i));
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : lowerList) sb.append(c);
        return sb.toString();
    }
}