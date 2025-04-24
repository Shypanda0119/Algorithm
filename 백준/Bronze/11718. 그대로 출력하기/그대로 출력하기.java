import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            list.add(input);
        }
        for(String s : list){
            System.out.println(s);
        }
    }
}
