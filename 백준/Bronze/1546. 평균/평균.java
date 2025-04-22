import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        double sum = 0;
        double max = Double.MIN_VALUE;
        int avg = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] / max * 100;
            sum += arr[i];
        }
        System.out.printf("%.2f", sum/n);
    }
}