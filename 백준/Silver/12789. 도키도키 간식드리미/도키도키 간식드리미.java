import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int count = 1;

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(st.nextToken());

      if (num == count) {
        count++;
      } else {
        stack.push(num);
      }

      while (!stack.isEmpty() && stack.peek() == count) {
        stack.pop();
        count++;
      }
    }

    if (stack.isEmpty()) System.out.println("Nice");
    else System.out.println("Sad");
  }
}