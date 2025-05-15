import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] split = myStr.split("[abc]");

        List<String> result = new ArrayList<>();
        for (String s : split) {
            if (!s.isEmpty()) {
                result.add(s);
            }
        }
        if(result.size()==0){
            result.add("EMPTY");
        }
        return result.toArray(new String[0]);
    }
}