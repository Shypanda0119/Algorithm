import java.io.*;
import java.util.*;

public class Main {
  public static long fibo(int n){
    if(n == 0) return 0;
    if(n == 1) return 1;

    long a = 0;
    long b = 1;

    for(int i = 2; i <= n; i++){
      long temp = a + b;
      a = b;
      b = temp;
    }

    return b;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n =  Integer.parseInt(br.readLine());
    System.out.println(fibo(n));
  }
}