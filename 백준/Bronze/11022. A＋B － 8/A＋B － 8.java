import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
		int N = Integer.parseInt(br.readLine());    
        int num1, num2;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
			bw.write("Case #" + (i + 1) + ": " + num1 + " + " + num2 + " = "+ (num1 + num2)+ "\n");
		}
		br.close();
		bw.flush();
		bw.close();
 
	}
}