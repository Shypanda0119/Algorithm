import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n =  Integer.parseInt(br.readLine());
    int maxX = Integer.MIN_VALUE;
    int maxY = Integer.MIN_VALUE;
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;

    for(int i=0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      if(x > maxX) maxX = x;
      if(x < minX) minX = x;
      
      if(y > maxY) maxY = y;
      if(y < minY) minY = y;
    }

    System.out.println((long)(maxX - minX) * (maxY - minY));
  }
}
