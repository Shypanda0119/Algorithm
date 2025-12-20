class Solution {
    public int[] solution(int[] arr, int[] query) {
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                right = left + query[i];
            } else {
                left = left + query[i];
            }
        }

        int[] answer = new int[right - left + 1];
        for (int i = left, idx = 0; i <= right; i++, idx++) {
            answer[idx] = arr[i];
        }

        return answer;
    }
}
