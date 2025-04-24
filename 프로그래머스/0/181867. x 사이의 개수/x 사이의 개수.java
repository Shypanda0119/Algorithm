class Solution {
    public int[] solution(String myString) {
        String[] answer = myString.split("x", -1);
        int[] arr = new int[answer.length];
        for(int i=0; i<answer.length; i++){
            arr[i]=answer[i].length();
        }
        return arr;
    }
}