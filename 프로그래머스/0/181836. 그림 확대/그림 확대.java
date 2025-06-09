import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> picList = new ArrayList<String>();
          for (int i = 0; i < picture.length; i++) {
            for (int a = 0; a < k; a++) {
                StringBuilder sb = new StringBuilder();
                
                for (int j = 0; j < picture[i].length(); j++) {
                    char ch = picture[i].charAt(j);
                    for (int m = 0; m < k; m++) { 
                        sb.append(ch);
                    }
                }
                picList.add(sb.toString());
            }
        }
        return picList.toArray(new String[0]);
    }
}