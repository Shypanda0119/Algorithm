class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int i=1; i * i <= n; i++){
            if(n % i == 0){ 
                sum += (n / i);
                sum = (n / i == i) ? sum : sum + i;
            }
        }
        return sum;
    }
}