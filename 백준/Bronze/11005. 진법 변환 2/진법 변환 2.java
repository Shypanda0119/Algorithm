import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    while(n != 0){
      if(0 <= n % b && n % b <= 9){
        sb.append(n % b);
      }else if(9 < n % b && n % b < 36){
        sb.append((char)('A' + (n % b) - 10));
      }
      n /= b;
    }

    System.out.println(sb.reverse().toString());
  }
  }
