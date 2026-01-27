import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String str = st.nextToken();
    int n = Integer.parseInt(st.nextToken());

    int sum = 0;
    for(int i = 0; i < str.length(); i++){
      if('0' <= str.charAt(i) &&  str.charAt(i) <= '9'){
        sum = sum * n + (str.charAt(i) - '0');
      }else if('A' <=  str.charAt(i) &&  str.charAt(i) <= 'Z'){
        sum = sum * n + (str.charAt(i) - 'A' + 10);
      }
    }

    System.out.println(sum);
  }
  }
