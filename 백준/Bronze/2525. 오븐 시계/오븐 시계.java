import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int work = Integer.parseInt(br.readLine());
        int totalMinutes = min + work;
        hour = (hour + totalMinutes / 60) % 24;
        min = totalMinutes % 60;
        System.out.println(hour + " " + min);
    }
}