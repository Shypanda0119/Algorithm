import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i = 0; i <  9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max_Num = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i <  9; i++){
            if(arr[i] > max_Num){
                max_Num = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max_Num + "\n" + index);
    }
}