import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int num = Integer.parseInt(br.readLine());
      int[] num_List = new int[num];
      StringTokenizer st = new StringTokenizer(br.readLine());
      int find_Num = Integer.parseInt(br.readLine());
      int cnt = 0;
      for(int i = 0; i < num; i++){
          num_List[i] = Integer.parseInt(st.nextToken());
          if (num_List[i] == find_Num) cnt++;
      }
      System.out.println(cnt);
    }
}