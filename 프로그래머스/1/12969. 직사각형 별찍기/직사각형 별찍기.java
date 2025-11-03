import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
    }
}