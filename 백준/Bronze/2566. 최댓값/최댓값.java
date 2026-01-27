import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int maxNum = Integer.MIN_VALUE;
    int maxX = 0;
    int maxY = 0;

    for (int i = 0; i < 9; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 9; j++) {
        int value = Integer.parseInt(st.nextToken());
        if (value > maxNum) {
          maxNum = value;
          maxX = i + 1;
          maxY = j + 1;
        }
      }
    }

    System.out.println(maxNum);
    System.out.println(maxX + " " + maxY);
  }
}
