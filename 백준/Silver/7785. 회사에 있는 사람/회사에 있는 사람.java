import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Set<String> set = new TreeSet<>(Collections.reverseOrder());

    for(int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      String name = st.nextToken();
      if(!set.add(name)) set.remove(name);
    }

    StringBuilder sb = new StringBuilder();
    List<String> list = new ArrayList<>(set);
    for(int i = 0; i < set.size(); i++){
      sb.append(list.get(i)).append("\n");
    }

    System.out.println(sb);
  }
}