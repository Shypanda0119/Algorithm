import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<friends.length; i++){
            map.put(friends[i], i);
        }
        
        int[][] changeGifts = new int[friends.length][friends.length];
        int[] nextGifts = new int[friends.length];
        int[] giftScore = new int[friends.length];
        int maxScore = Integer.MIN_VALUE;
        
        for(String gift : gifts){
            String[] giftSplit = gift.split(" ");
            changeGifts[map.get(giftSplit[0])][map.get(giftSplit[1])]++;
        }
        
        for(int i=0; i<changeGifts.length; i++){
            int takeScore = 0;
            int giveScore = 0;
            for(int j=0; j<changeGifts[i].length; j++){
                giveScore += changeGifts[i][j];
                takeScore += changeGifts[j][i];
                }
            giftScore[i] = giveScore - takeScore;
        }
        
        for(int i=0; i<changeGifts.length; i++){
            for(int j=i+1; j<changeGifts.length; j++){
                if(changeGifts[i][j] > changeGifts[j][i]){
                    nextGifts[i]++;
                }else if(changeGifts[i][j] < changeGifts[j][i]){
                    nextGifts[j]++;
                }else if(changeGifts[i][j] == changeGifts[j][i]){
                    if(giftScore[i] > giftScore[j]) nextGifts[i]++;
                    else if(giftScore[i] < giftScore[j]) nextGifts[j]++;
                }
            }
        }
        for(int num : nextGifts){
            if(num > maxScore) maxScore = num;          
        }
        return maxScore;
    }
}