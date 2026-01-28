import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i=0; i<n; i++){
      int money = Integer.parseInt(br.readLine());
      sb.append(money / 25).append(" ");
      money %= 25;
      sb. append(money / 10).append(" ");
      money %= 10;
      sb. append(money / 5).append(" ");
      money %= 5;
      sb. append(money).append("\n");
    }
    System.out.println(sb.toString());
    }
  }
