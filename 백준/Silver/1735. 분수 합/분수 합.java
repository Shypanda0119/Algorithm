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
    StringTokenizer st = new StringTokenizer(br.readLine());
    int firstNumerator =  Integer.parseInt(st.nextToken());
    int firstDenominator = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int secondNumerator =  Integer.parseInt(st.nextToken());
    int secondDenominator = Integer.parseInt(st.nextToken());

    int denominator = lcm(firstDenominator, secondDenominator);
    int numerator = (denominator / firstDenominator * firstNumerator) + (denominator / secondDenominator * secondNumerator);
    int g = gcd(numerator, denominator);
    numerator /= g;
    denominator /= g;
    System.out.println(numerator+" "+denominator);
  }
}