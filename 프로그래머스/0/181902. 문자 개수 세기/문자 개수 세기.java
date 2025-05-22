class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++){
            int idx = my_string.charAt(i) - 'A';
            if(idx > 25) idx -= 6;
            answer[idx]++;
        }
        return answer;
    }
}