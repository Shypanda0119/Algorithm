import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

    int[] sorted = arr.clone();
    Arrays.sort(sorted);

    Map<Integer, Integer> map = new HashMap<>(n * 2);
    int rank = 0;

    map.put(sorted[0], 0);
    for (int i = 1; i < n; i++) {
      if (sorted[i] != sorted[i - 1]) {
        map.put(sorted[i], ++rank);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(map.get(arr[i]));
      if (i + 1 < n) sb.append(' ');
    }
    System.out.print(sb);
  }
}