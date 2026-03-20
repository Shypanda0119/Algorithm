import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 1;
    int n = Integer.parseInt(br.readLine());

    for(int i=1; i<=n; i++){
      sum *= i;
    }
    System.out.println(sum);
  }
}