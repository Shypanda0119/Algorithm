class Solution {
    public String solution(int[] num) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<num.length; i++){
            if(num[i]-num[i-1] == 1){
                sb.append("w");
            }else if(num[i]-num[i-1] == 10){
                sb.append("d");
            }else if(num[i]-num[i-1] == -1){
                sb.append("s");
            }else{
                sb.append("a");
            }
        }
    return sb.toString();
    }
}