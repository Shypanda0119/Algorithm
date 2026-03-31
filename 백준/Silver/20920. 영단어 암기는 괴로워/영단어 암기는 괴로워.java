import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    Map<String, Integer> map = new HashMap<>();
    int cnt = 0;
    for(int i=0; i<n; i++){
      String str = br.readLine();
      if(str.length() >= m) map.put(str, map.getOrDefault(str, 0) + 1);
    }

    List<String> list = new ArrayList<>(map.keySet());

    Collections.sort(list, (a, b) -> {
      if (!map.get(a).equals(map.get(b))) {
        return map.get(b) - map.get(a);
      }
      if (a.length() != b.length()) {
        return b.length() - a.length();
      }
      return a.compareTo(b);
    });
    
    StringBuilder sb = new StringBuilder();

    for (String word : list) {
      sb.append(word).append("\n");
    }

    System.out.print(sb);
  }
}