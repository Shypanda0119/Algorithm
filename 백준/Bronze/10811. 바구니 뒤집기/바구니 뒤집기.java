import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) -1;
            int y = Integer.parseInt(st.nextToken()) -1;
            while(x < y){
                temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                x++;
                y--;
            }
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}