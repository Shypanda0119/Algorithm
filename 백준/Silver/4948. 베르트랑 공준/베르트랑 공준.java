import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[] isPrime = new boolean[123456 * 2 + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = false;
    isPrime[1] = false;
    for (int i = 2; i * i < isPrime.length; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j < isPrime.length; j += i){
          isPrime[j] = false;
        }
      }
    }

    int[] prefix = new int[isPrime.length];
    for (int i = 1; i < isPrime.length; i++)  {
      prefix[i] = prefix[i - 1] + (isPrime[i] ? 1 : 0);
    }

    StringBuilder sb = new StringBuilder();
    while (true) {
      String str = br.readLine();
      int n = Integer.parseInt(str);
      if (n == 0) break;

      sb.append(prefix[2 * n] - prefix[n]).append('\n');
    }

    System.out.print(sb);
  }
}