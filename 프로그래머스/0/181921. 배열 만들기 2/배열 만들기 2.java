import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("5");

        while (!q.isEmpty()) {
            String cur = q.poll();
            int num = Integer.parseInt(cur);

            if (num > r) continue;
            if (num >= l) list.add(num);

            q.add(cur + "0");
            q.add(cur + "5");
        }

        if (list.isEmpty()) return new int[]{-1};

        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
