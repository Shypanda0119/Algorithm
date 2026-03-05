import java.io.*;
import java.util.*;

public class Main {

  public static int gcd(int a, int b){
    while(b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  public static int lcm(int a, int b){
    return a / gcd(a, b) * b;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] location = new int[n];

    for(int i = 0; i < n; i++) {
      location[i] = Integer.parseInt(br.readLine());
    }

    int g = 0;
    for (int i = 0; i < n - 1; i++) {
      int d = location[i + 1] - location[i];
      g = (i == 0) ? d : gcd(g, d);
    }
    
    int answer = 0;
    for (int i = 0; i < n - 1; i++) {
      int d = location[i + 1] - location[i];
      answer += (d / g) - 1;
    }

    System.out.println(answer);


  }
}