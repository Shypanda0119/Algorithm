import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    List<Integer> small = new ArrayList<>();
    List<Integer> large = new ArrayList<>();

    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        small.add(i);
        if (i != n / i) {
          large.add(n / i);
        }
      }
    }
    
    Collections.reverse(large);
    small.addAll(large);

    if (k <= small.size()) {
      System.out.println(small.get(k - 1));
    } else {
      System.out.println(0);
    }
  }
}
