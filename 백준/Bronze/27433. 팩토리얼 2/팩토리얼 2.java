import java.io.*;
import java.util.*;

public class Main {
  public static long factorial(long num){
    if(num==0){
      return 1;
    }
    return num * factorial(num-1);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n =  Long.parseLong(br.readLine());
    System.out.println(factorial(n));
  }
}