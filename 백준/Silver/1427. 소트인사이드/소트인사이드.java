import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int[] count = new  int[10];

    for(int i=0; i<str.length(); i++) {
      count[str.charAt(i) - '0']++;
    }

    StringBuilder sb = new StringBuilder();
    for(int i=9; i>=0; i--) {
      while(count[i] > 0) {
        sb.append(i);
        count[i]--;
      }
    }

    System.out.println(sb);
  }
}

