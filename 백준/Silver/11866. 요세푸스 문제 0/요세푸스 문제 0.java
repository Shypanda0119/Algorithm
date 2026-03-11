import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Deque<Integer> queue = new ArrayDeque<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder("<");

    for(int i = 1; i <= n; i++){
      queue.offer(i);
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < k - 1; j++){
        queue.offer(queue.poll());
      }
      sb.append(queue.poll());
      if (!queue.isEmpty()) {
        sb.append(", ");
      }
    }

    sb.append(">");
    System.out.println(sb);
  }
}