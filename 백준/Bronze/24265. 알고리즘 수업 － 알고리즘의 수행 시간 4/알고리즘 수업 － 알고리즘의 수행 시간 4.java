import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());

        BigInteger result = n.multiply(n.subtract(BigInteger.ONE)).divide(BigInteger.valueOf(2));

        System.out.println(result);
        System.out.println(2);
    }
}
