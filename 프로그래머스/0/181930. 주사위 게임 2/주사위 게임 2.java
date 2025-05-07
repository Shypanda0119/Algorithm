class Solution {
    public int solution(int a, int b, int c) {
        int num=0;
        if(a==b && b==c){
            num += (a*3) * (a*a*3) * (a*a*a*3);
        }else if((a==b && a!=c) || (a==c && a!=b) || (b==c &&  b!=a)){
            num += (a+b+c) * (a*a+b*b+c*c);
        }else{
            num += a+b+c;
        }
        return num;
    }
}