class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        int mod;
        int number = 1;
        int answer = 0;
        while(n != 0){
            mod = n % 3;
            sb.append(mod);
            n /= 3;
            }
        String bin = sb.toString();
        for(int i = bin.length() - 1; i>=0; i--){
            answer += (bin.charAt(i) - '0') * number;
            number *= 3;
        }
        return answer;
    }
}