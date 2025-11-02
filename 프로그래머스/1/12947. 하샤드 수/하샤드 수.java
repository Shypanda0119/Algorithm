class Solution {
    public boolean solution(int x) {
        int hap = 0;
        int num = x;
        while(num != 0){
            hap += num % 10;
            num /= 10;
        }
        return x % hap == 0 ? true : false;
    }
}