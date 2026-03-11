import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Deque<Integer> deque = new ArrayDeque<>();

    for(int i=1; i<=n; i++){
      deque.addLast(i);
    }

    while(deque.size() > 1){
      deque.pop();
      int pop = deque.pop();
      deque.addLast(pop);
    }

    System.out.println(deque.peek());
  }
}