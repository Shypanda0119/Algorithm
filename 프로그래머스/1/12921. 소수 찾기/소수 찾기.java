class Solution {
    public int solution(int n) {
        int num = 1; // 1은 소수가 아니기 때문
        for(int i=2; i<=n; i++){
            for(int j=2; j * j<=n; j++){
                if(i != j && i % j == 0){
                    num++;
                    break;
                }
            }
        }
        return n-num;
    }
}