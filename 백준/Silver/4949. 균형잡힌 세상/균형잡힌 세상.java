import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      String str = br.readLine();
      if (str.equals(".")) break;

      Stack<Character> stack = new Stack<>();
      boolean valid = true;

      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch == '(' || ch == '[') {
          stack.push(ch);
        } else if (ch == ')') {
          if (stack.isEmpty() || stack.pop() != '(') {
            valid = false;
            break;
          }
        } else if (ch == ']') {
          if (stack.isEmpty() || stack.pop() != '[') {
            valid = false;
            break;
          }
        }
      }

      if (!stack.isEmpty()) valid = false;

      sb.append(valid ? "yes\n" : "no\n");
    }

    System.out.print(sb);
  }
}