import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][2];
    for(int i = 0; i < n; i++) {
      String[] str = br.readLine().split(" ");
      arr[i][0] = Integer.parseInt(str[0]);
      arr[i][1] = Integer.parseInt(str[1]);
    }

    Arrays.sort(arr, new Comparator<int[]>() {
      @Override
      public int compare(int[] a, int[] b) {
        if (a[0] == b[0]) {
          return a[1] - b[1];
        }
        return a[0] - b[0];
      }
    });

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
    }

    System.out.print(sb);
  }
}

