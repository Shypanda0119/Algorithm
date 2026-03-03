import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] line = new  String[n];
    for(int i = 0; i < n; i++){
      line[i] = br.readLine();
    }
    Arrays.sort(line, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if(o1.length() == o2.length()){
          return o1.compareTo(o2);
        }
        return o1.length() - o2.length();
      }
    });

    StringBuilder sb = new StringBuilder();
    String prev = null;
    for (String s : line) {
      if (!s.equals(prev)) {
        sb.append(s).append('\n');
        prev = s;
      }
    }

    System.out.println(sb);
  }
}

