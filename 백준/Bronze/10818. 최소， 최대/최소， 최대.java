import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max_Num = arr[0], min_Num = arr[0];
        for(int a : arr){
            if(a > max_Num) {max_Num = a;}
            else if(a < min_Num) {min_Num = a;}
            else continue;
        }
        System.out.println(min_Num + " " + max_Num);
    }
}