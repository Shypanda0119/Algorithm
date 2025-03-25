import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] basket = new int[a];
        
        for(int i=0; i < a; i++){
           basket[i] = i+1;
        }

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) -1 ;
            int y = Integer.parseInt(st.nextToken()) -1 ;
            int temp = 0;
            temp = basket[x];
            basket[x] = basket[y];
            basket[y] = temp;
            
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            sb.append(basket[i]).append(" ");
        }

        System.out.println(sb);
    }
}
