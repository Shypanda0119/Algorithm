class Solution {
    public int[] solution(String s) {
        int[] alphabet = new int[26];
        int[] answer = new int[s.length()];
        int index = 0;
        int cnt = 0;
        
        for(int i=0; i<alphabet.length; i++){
            alphabet[i] = -1;
        }
        
        for(int i=0; i<s.length(); i++){
            if(alphabet[s.charAt(i) - 'a'] == -1){
                answer[index++] = -1;
                alphabet[s.charAt(i) - 'a'] = cnt;
            }else{
                answer[index++] =  cnt - alphabet[s.charAt(i) - 'a'];
                alphabet[s.charAt(i) - 'a'] = cnt;
            }
            cnt++;
        }
        return answer;
    }
}