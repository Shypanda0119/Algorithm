import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double maxTime = 0.0;
        double sum = 0.0;

        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        for (int i = 0; i < 20; i++) {
            String str = br.readLine();
            String[] strLine = str.split(" ");

            double time = Double.parseDouble(strLine[1]);
            String score = strLine[2];

            if (!score.equals("P")) {
                maxTime += time;
                sum += time * map.get(score);
            }
        }

        System.out.println(sum / maxTime);
    }
}
