class Solution {
    public int solution(int[][] sizes) {
        int max_width = 0;
        int max_height = 0;
        
        for(int i=0; i<sizes.length; i++){
            max_width = Math.max(sizes[i][0], sizes[i][1]) > max_width ? Math.max(sizes[i][0], sizes[i][1]) : max_width;
            max_height = Math.min(sizes[i][0], sizes[i][1]) > max_height ?  Math.min(sizes[i][0], sizes[i][1]) : max_height;
        }
        return max_width * max_height;

    }
}