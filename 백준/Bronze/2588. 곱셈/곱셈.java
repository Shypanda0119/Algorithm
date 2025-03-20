import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str1 = br.readLine();
      String str2 = br.readLine();
      int a = Integer.parseInt(str1);
      int b = Integer.parseInt(str2);
      int c = b;
      System.out.println(a * (c % 10));
      c = c/10;
      System.out.println(a * (c % 10));
      c = c/10;
      System.out.println(a * c);
      System.out.println(a * b);

    }
}