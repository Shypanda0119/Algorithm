import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());
    long v = Long.parseLong(st.nextToken());

    long d = a - b;
    long target = v - a;

    long days = (target + d - 1) / d + 1; 
    System.out.println(days);
  }
}
