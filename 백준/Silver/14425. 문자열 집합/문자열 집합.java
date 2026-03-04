import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int count = 0;

    Set<String> set = new HashSet<>();
    for(int i=0; i<n; i++){
      set.add(br.readLine());
    }

    for(int i=0; i<m; i++){
      String str = br.readLine();
      if(set.contains(str)) count++;
    }

    System.out.println(count);
  }
}