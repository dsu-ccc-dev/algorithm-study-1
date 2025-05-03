import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String kind = clothes[i][1];

            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }

        Collection<Integer> values = map.values();

        for (int count : values) {
            answer *= (count + 1);
        }
        answer -= 1;

        return answer;
    }
}