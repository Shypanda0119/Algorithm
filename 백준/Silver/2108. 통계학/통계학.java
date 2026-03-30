import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    List<Integer> list = new ArrayList<>();
    int sum = 0;

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(br.readLine());
      list.add(num);
      sum += num;
    }

    Collections.sort(list);

    Map<Integer, Integer> map = new HashMap<>();
    for (int num : list) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int maxCount = 0;
    for (int count : map.values()) {
      if (count > maxCount) {
        maxCount = count;
      }
    }

    List<Integer> modeList = new ArrayList<>();
    for (int key : map.keySet()) {
      if (map.get(key) == maxCount) {
        modeList.add(key);
      }
    }

    Collections.sort(modeList);

    int mode;
    if (modeList.size() > 1) {
      mode = modeList.get(1);
    } else {
      mode = modeList.get(0);
    }

    System.out.println(Math.round((double) sum / n));
    System.out.println(list.get(n / 2));
    System.out.println(mode);
    System.out.println(list.get(n - 1) - list.get(0));
  }
}