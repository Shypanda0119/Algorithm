import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            Set<Character> alphabetSet = new HashSet<>();
            boolean flag = true;

            char prev = word.charAt(0);
            alphabetSet.add(prev);

            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(j) != prev) {
                    if (!alphabetSet.add(word.charAt(j))) {
                        flag = false;
                        break;
                    }
                    prev = word.charAt(j);
                }
            }

            if (flag) count++;
        }

        System.out.println(count);
    }
}
