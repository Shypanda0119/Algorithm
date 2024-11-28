class Solution {
    public int[] solution(int[] n) {
        int temp;
        int answer[] = new int[5];
        for(int i=0; i<n.length-1; i++){
            for(int j=0; j<n.length-i-1; j++){
                if(n[j] > n[j+1]){
                    temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        for(int k=0;k<5;k++){
            answer[k]=n[k];
        }
        return answer;
    
    }
}