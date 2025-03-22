import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());
        if( first == second && second == third ) {
            System.out.println(10000 + first * 1000);
        }else if(first == second || second == third) {
            System.out.println(1000 + second * 100);
        }else if(first == third){
            System.out.println(1000 + third * 100);
        }else{
            if(first > second && first > third){
                System.out.println(first * 100);
            } else if (second > first && second > third) {
                System.out.println(second * 100);
            }else{
                System.out.println(third * 100);
            }
        }
    }
}