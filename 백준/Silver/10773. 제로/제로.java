import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();

    for(int i = 0; i < k; i++){
      int n = Integer.parseInt(br.readLine());
      if(n == 0) stack.pop();
      else stack.push(n);
    }

    int sum = 0;
    for(int num : stack){
      sum += num;
    }

    System.out.println(sum);
  }
}