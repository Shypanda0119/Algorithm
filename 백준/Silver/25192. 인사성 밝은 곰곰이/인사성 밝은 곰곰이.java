import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    Set<String> set = new HashSet<>();
    int count = 0;

    for (int i = 0; i < n; i++) {
      String str = br.readLine();

      if (str.equals("ENTER")) {
        set.clear();
      } else {
        if (!set.contains(str)) {
          set.add(str);
          count++;
        }
      }
    }

    System.out.println(count);
  }
}