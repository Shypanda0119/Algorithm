import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int count = 0;

    Set<Integer> nSet = new HashSet<>();
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++){
      nSet.add(Integer.parseInt(st.nextToken()));
    }

    Set<Integer> mSet = new HashSet<>();
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < m; i++){
      mSet.add(Integer.parseInt(st.nextToken()));
    }

    for(int i : nSet){
      if(mSet.contains(i)) count++;
    }

    System.out.println(nSet.size() + mSet.size() - (count * 2));
  }
}