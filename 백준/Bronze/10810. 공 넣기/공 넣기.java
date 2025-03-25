import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int basket = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int[] num_basket = new int[basket];
        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            for(int j=(x-1); j<y; j++){
                num_basket[j] = z;
            }
        }
        for (int i = 0; i < basket; i++) {
            sb.append(num_basket[i]).append(" ");
        }
        System.out.println(sb);
    }
}