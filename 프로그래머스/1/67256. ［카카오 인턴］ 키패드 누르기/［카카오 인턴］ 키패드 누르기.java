class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;   
        int right = 12; 
        
        for (int num : numbers) {
            if (num == 0) num = 11;
            if (num % 3 == 1) { 
                sb.append("L");
                left = num;
            } else if (num % 3 == 0) { 
                sb.append("R");
                right = num;
            } else { 
                int leftDist = Math.abs(left - num) / 3 + Math.abs(left - num) % 3;
                int rightDist = Math.abs(right - num) / 3 + Math.abs(right - num) % 3;

                if (leftDist < rightDist) {
                    sb.append("L");
                    left = num;
                } else if (leftDist > rightDist) {
                    sb.append("R");
                    right = num;
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        right = num;
                    } else {
                        sb.append("L");
                        left = num;
                    }
                }
            }
        }
        return sb.toString();
    }
}
