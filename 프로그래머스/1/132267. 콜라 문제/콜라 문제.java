class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int cokes = (n / a) * b; 
            int bottles = n % a;
            answer += cokes;
            n = cokes + bottles;
        }
        return answer;
    }
}
