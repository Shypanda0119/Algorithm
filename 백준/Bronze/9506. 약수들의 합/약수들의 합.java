import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String str = br.readLine();
      if (str == null) break;
      if (str.equals("-1")) break;

      int n = Integer.parseInt(str);
      
      if (n == 1) {
        System.out.println("1 is NOT perfect.");
        continue;
      }

      List<Integer> divisors = new ArrayList<>();
      divisors.add(1); 

      int sum = 1;

      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
          int j = n / i;
          
          divisors.add(i);
          sum += i;
          
          if (j != i && j != n) {
            divisors.add(j);
            sum += j;
          }
        }
      }

      Collections.sort(divisors);

      if (sum == n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n).append(" = ");
        for (int i = 0; i < divisors.size(); i++) {
          if (i > 0) sb.append(" + ");
          sb.append(divisors.get(i));
        }
        System.out.println(sb);
      } else {
        System.out.println(n + " is NOT perfect.");
      }
    }
  }
}
