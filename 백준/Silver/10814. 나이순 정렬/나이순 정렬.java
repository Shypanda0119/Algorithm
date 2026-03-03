import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    String[][] information = new String[n][2];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      information[i][0] = st.nextToken();
      information[i][1] = st.nextToken();
    }

    Arrays.sort(information, new Comparator<String[]>() {
      @Override
      public int compare(String[] o1, String[] o2) {
        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]); 
      }
    });

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(information[i][0]).append(' ')
          .append(information[i][1]).append('\n');
    }
    System.out.print(sb);
  }
}