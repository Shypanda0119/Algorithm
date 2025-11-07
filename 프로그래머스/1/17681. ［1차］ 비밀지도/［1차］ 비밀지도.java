class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String answer[] = new String[n];
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            String arr1Binary = String.format("%" + n + "s", Integer.toBinaryString(arr1[i]))
               .replace(' ', '0');
            String arr2Binary = String.format("%" + n + "s", Integer.toBinaryString(arr2[i]))
               .replace(' ', '0');
            for(int j=0; j<n; j++){
                if(arr1Binary.charAt(j) == '1' || arr2Binary.charAt(j) == '1') sb.append("#");
                else sb.append(" ");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}