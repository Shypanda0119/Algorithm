import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        if (map.size() == 1) {
            int p = a;
            return 1111 * p;
        }

        if (map.size() == 2) {
            int p = 0, q = 0;
            for (int key : map.keySet()) {
                if (map.get(key) == 3) p = key;
                else q = key;
            }
            if (p != 0) {
                return (10 * p + q) * (10 * p + q);
            } else {
                Iterator<Integer> it = map.keySet().iterator();
                p = it.next();
                q = it.next();
                return (p + q) * Math.abs(p - q);
            }
        }

        if (map.size() == 3) {
            int result = 1;
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    result *= key;
                }
            }
            return result;
        }

        Arrays.sort(arr);
        return arr[0];
    }
}
