import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] words = new String[5];
    int maxSize = 0;
    int index = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 5; i++) {
      words[i] = br.readLine();
      if (maxSize < words[i].length())
        maxSize = words[i].length();
    }
    while(index < maxSize) {
      for (int i = 0; i < 5; i++) {
        if (index < words[i].length()) {
          sb.append(words[i].charAt(index));
        }
      }
      index++;
    }
      System.out.println(sb.toString());
    }
  }
