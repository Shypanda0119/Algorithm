import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      map.put(Integer.parseInt(st.nextToken()), 1);
    }

    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < m; i++){
      sb.append(map.getOrDefault(Integer.parseInt(st.nextToken()), 0)).append(" ");
    }

    System.out.println(sb);
  }
}