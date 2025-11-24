class Solution {
    public int solution(int number, int limit, int power) {
        int[] numberArr = new int[number + 1];
        numberArr[1] = 1;
        for(int j=2; j<=number; j++){
            int count = 2;
            for(int i=2; i*i<=j; i++){
                if(j % i == 0 && j != i*i) count += 2;
                else if(j == i*i) count++;
            }
            numberArr[j] = count;
        }
        
        int sum = 0;
        for(int k : numberArr){
            if(k > limit) sum += power;
            else sum += k;
        }
        
        return sum;
    }
}