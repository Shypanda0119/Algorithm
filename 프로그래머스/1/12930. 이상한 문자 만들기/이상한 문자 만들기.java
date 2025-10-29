class Solution {
    public String solution(String s) {
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){ 
                sb.append(' ');
                flag = true;
                continue;
            }
            if(flag){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            flag = !flag;
        }
        return sb.toString();
    }
}