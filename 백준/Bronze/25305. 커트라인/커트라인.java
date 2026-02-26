import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int rank = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int[] grade = new int[n];
    for(int i=0; i<n; i++){
      grade[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(grade);
    System.out.println(grade[n - rank]);
  }
}