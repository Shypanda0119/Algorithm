class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int unknown = 0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                unknown++;
                continue;
            }
            for(int n : win_nums){
                if(lottos[i] == n) cnt++;
            }            
        }
        answer[0] = (unknown == 0) && (cnt == 0) ? 6 : (6 - unknown - cnt + 1);
        answer[1] = cnt != 0 ? (6 - cnt + 1) : 6;
        return answer;
    }
}