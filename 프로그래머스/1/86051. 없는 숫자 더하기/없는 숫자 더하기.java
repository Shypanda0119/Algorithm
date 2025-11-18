class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        boolean[] num = new boolean[10];
        for(int i : numbers){
            num[i] = true;
        }
        for(int i=0; i<num.length; i++){
            if(num[i] == false) sum += i;
        }
        
        return sum;
    }
}