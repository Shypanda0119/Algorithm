class Solution {
    public int solution(int num) {
        Long longNum = (long)num;
        int count = 0;
        while(true){
            if(longNum == 1) break;
            if(longNum % 2 == 0){
                longNum /= 2;
                count++;
            }else{
                longNum = longNum * 3 + 1;
                count++;
            }
            if(count > 500) return -1;
        }
        return count;
    }
}