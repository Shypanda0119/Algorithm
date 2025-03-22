import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        if (min < 45){
            if (hour == 0){
                hour = 24;
            }
            min = min + 60 - 45;
            hour -= 1;
        }else{
            min -= 45;
        }
        System.out.println(hour+" "+min);
    }
}