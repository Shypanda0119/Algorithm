class Solution {
    public int solution(int n, int w, int num) {
        int height = (n + w - 1) / w;
        int rowBox = 0;
        int colBox = 0;
        int[][] arr = new int[height][w];

        for (int i = 1; i <= n; i++) {
            int row = (i - 1) / w;
            int col = (i - 1) % w;

            if (row % 2 == 1) {
                col = w - 1 - col;
            }

            arr[row][col] = i;
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == num){
                    rowBox = i;
                    colBox = j;
                }
            }
        }
        int answer = 0;
        for (int i = rowBox; i < arr.length; i++) {
            if (arr[i][colBox] != 0) {
                answer++;
            }
        }
        return answer;
    }
}

