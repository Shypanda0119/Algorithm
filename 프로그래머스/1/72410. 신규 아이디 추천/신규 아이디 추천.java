class Solution {
    public String solution(String new_id) {
        String step1 = new_id.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        for(char c : step1.toCharArray()) {
            if((c >= 'a' && c <= 'z') || 
               (c >= '0' && c <= '9') || 
               c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }
        
        String temp = sb.toString().replace("..", ".");
        while (temp.contains("..")) {
            temp = temp.replace("..", ".");
        }
        sb = new StringBuilder(temp);
        
        if (sb.length() > 0 && sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }

        if (sb.length() == 0) {
            sb.append("a");
        }
        
        if (sb.length() > 15) {
            sb.setLength(15);
            
            if (sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        
        while (sb.length() <= 2) {
            char lastChar = sb.charAt(sb.length() - 1);
            sb.append(lastChar);
        }

        return sb.toString();
    }
}