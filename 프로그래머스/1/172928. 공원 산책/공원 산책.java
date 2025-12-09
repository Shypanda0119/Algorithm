class Solution {
    public int[] solution(String[] park, String[] routes) {
        int startX = 0;
        int startY = 0;

        outer:
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                    break outer; 
                }
            }
        }

        for (String s : routes) {
            String[] arr = s.split(" ");
            String dir = arr[0];
            int d = Integer.parseInt(arr[1]);

            boolean canMove = true;

            if (dir.equals("E")) {
                if (startY + d >= park[0].length()) continue;
                for (int y = startY + 1; y <= startY + d; y++) {
                    if (park[startX].charAt(y) == 'X') {
                        canMove = false;
                        break;
                    }
                }
                if (canMove) startY += d;
            }

            else if (dir.equals("W")) {
                if (startY - d < 0) continue;

                for (int y = startY - 1; y >= startY - d; y--) {
                    if (park[startX].charAt(y) == 'X') {
                        canMove = false;
                        break;
                    }
                }

                if (canMove) startY -= d;
            }

            else if (dir.equals("S")) {
                if (startX + d >= park.length) continue;

                for (int x = startX + 1; x <= startX + d; x++) {
                    if (park[x].charAt(startY) == 'X') {
                        canMove = false;
                        break;
                    }
                }

                if (canMove) startX += d;
            }

            else if (dir.equals("N")) {
                if (startX - d < 0) continue;

                for (int x = startX - 1; x >= startX - d; x--) {
                    if (park[x].charAt(startY) == 'X') {
                        canMove = false;
                        break;
                    }
                }

                if (canMove) startX -= d;
            }
        }

        return new int[]{startX, startY};
    }
}
