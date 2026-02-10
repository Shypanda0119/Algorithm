import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        long a1 = Long.parseLong(s[0]);
        long a0 = Long.parseLong(s[1]);

        long c = Long.parseLong(br.readLine());
        long n0 = Long.parseLong(br.readLine());

        if (a1 <= c && a1 * n0 + a0 <= c * n0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
