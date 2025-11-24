import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] result = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            if(pq.size() < k){
                pq.offer(score[i]);
            } else if(score[i] > pq.peek()){
                pq.poll();
                pq.offer(score[i]);
            }
            result[i] = pq.peek();
        }
        
        return result;
    }
}
