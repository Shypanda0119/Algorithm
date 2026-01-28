import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int spot = 2;
    for (int i = 1; i <= n; i++) {
      spot = spot * 2 - 1;
    }
    System.out.println(spot * spot);
  }
}
