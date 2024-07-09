package leetcodeTasks.medium;

import java.util.*;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("raaeaedere"));
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new TreeMap<>();

        for (Character symbol : s.toCharArray()) {
            map.put(symbol, map.getOrDefault(symbol, 0) + 1);
        }
        List<Character> symbolList = new ArrayList<>(map.keySet());
        symbolList.sort((a, b) -> map.get(b) - map.get(a));


        StringBuilder builder = new StringBuilder();
        for (Character symbol : symbolList) {
            int count = 0;
            while (count < map.get(symbol)) {
                builder.append(symbol);
                count++;
            }
            count = 0;
        }
        return builder.toString();
    }
}
