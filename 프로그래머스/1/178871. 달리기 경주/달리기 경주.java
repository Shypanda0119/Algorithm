import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
       for (String name : callings) {
            int idx = map.get(name);
            int frontIdx = idx - 1;

            String frontPlayer = players[frontIdx];
            String nowPlayer = players[idx];

            players[frontIdx] = nowPlayer;
            players[idx] = frontPlayer;

            map.put(nowPlayer, frontIdx);
            map.put(frontPlayer, idx);
        }
        return players;
    }
}