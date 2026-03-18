import java.io.*;
import java.util.*;

public class Main {
    static class Balloon {
        int idx, move;
        Balloon(int idx, int move) {
            this.idx = idx;
            this.move = move;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Balloon> dq = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            dq.offer(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();

        while (!dq.isEmpty()) {
            Balloon cur = dq.pollFirst();
            sb.append(cur.idx).append(" ");

            if (dq.isEmpty()) break;

            int move = cur.move;

            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    dq.offerLast(dq.pollFirst());
                }
            } else {
                for (int i = 0; i < -move; i++) {
                    dq.offerFirst(dq.pollLast());
                }
            }
        }

        System.out.println(sb.toString());
    }
}