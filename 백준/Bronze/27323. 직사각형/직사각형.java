import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int width = Integer.parseInt(br.readLine());
        int height = Integer.parseInt(br.readLine());
        System.out.print(width * height);
    }
}