import java.io.*;
import java.util.*;

public class Main {
  static boolean isPrime(long n) {
    if (n < 2) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0) return false;

    for (long i = 3; i * i <= n; i += 2) {
      if (n % i == 0) return false;
    }
    return true;
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {
      long number = Long.parseLong(br.readLine());

      if (number <= 2) {
        sb.append(2).append('\n');
        continue;
      }

      if (number % 2 == 0) number++;

      while (!isPrime(number)) number += 2;
      sb.append(number).append('\n');
    }

    System.out.print(sb);
  }
}