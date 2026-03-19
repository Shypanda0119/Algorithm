import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] a = new int[n];
    int[] b = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      b[i] = Integer.parseInt(st.nextToken());
    }

    Deque<Integer> deque = new ArrayDeque<>();

    for (int i = n - 1; i >= 0; i--) {
      if (a[i] == 0) {
        deque.addLast(b[i]);
      }
    }

    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < m; i++) {
      int c = Integer.parseInt(st.nextToken());
      deque.addLast(c);
      sb.append(deque.pollFirst()).append(" ");
    }

    System.out.println(sb);
  }
}