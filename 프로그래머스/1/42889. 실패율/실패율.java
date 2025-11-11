import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        List<double[]> list = new ArrayList<>();
        int[] stageNum = new int[N + 2];
        int total = stages.length;
        Double fail; 
        for(int k : stages){
            stageNum[k]++;
        }
        for(int i=1; i<= N; i++){
            fail = total == 0 ? 0 : stageNum[i] / (double)total;
            total -= stageNum[i];
            list.add(new double[]{i, fail});
        }
        Collections.sort(list, new Comparator<double[]>() {
            @Override
            public int compare(double[] a, double[] b) {
                int cmp = Double.compare(b[1], a[1]);
                if (cmp != 0) return cmp;
                return Double.compare(a[0], b[0]);
            }
        });
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) list.get(i)[0];
        }
        return answer;
    }
}