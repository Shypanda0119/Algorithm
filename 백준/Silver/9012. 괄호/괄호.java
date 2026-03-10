import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < k; i++) {
      String str = br.readLine();
      int count = 0;
      boolean isValid = true;

      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == '(') {
          count++;
        } else {
          count--;
        }

        if (count < 0) {
          isValid = false;
          break;
        }
      }

      if (isValid && count == 0) sb.append("YES\n");
      else sb.append("NO\n");
    }

    System.out.println(sb);
  }
}