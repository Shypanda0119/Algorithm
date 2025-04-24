import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] alphabet = new int[26];
        for(int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }
        for(int i = 0; i < str.length(); i++) {
            int index = str.charAt(i)-'a';
            if(alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }
        for(int i : alphabet) {
            System.out.print(i+" ");
        }
    }
}