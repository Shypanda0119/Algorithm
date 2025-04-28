class Solution {
    public int solution(int[] num_list) {
        int sum = 0, mul = 1;
        for(int i=0; i<num_list.length; i++){
            if(num_list.length >= 11){
                sum += num_list[i];
            }else{
                mul *= num_list[i];
            }
        }
        if(num_list.length >= 11){
            return sum;
        }else{
            return mul;
        }
    }
}