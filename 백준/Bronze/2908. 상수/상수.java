import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        int[] arrInt1 = new int[3];
        int[] arrInt2 = new int[3];
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < 3; i++) {
            arrInt1[i] = str1.charAt(i) - '0';
            arrInt2[i] = str2.charAt(i) - '0';
        }
        for(int i = 2; i >= 0; i--) {
            sum1 += arrInt1[i] * Math.pow(10,i);
            sum2 += arrInt2[i] * Math.pow(10,i);
        }
        if(sum1 > sum2){
            System.out.println(sum1);
        }else{
            System.out.println(sum2);
        }
    }
}
