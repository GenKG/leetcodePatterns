package leetcodeTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {

    public static void main(String[] args) {
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (countS.containsKey(s.charAt(i))) {
                char symbol = s.charAt(i);
                int count = countS.get(symbol);
                countS.put(symbol, ++count);
            } else {
                countS.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (countT.containsKey(t.charAt(i))) {
                char symbol = t.charAt(i);
                int count = countT.get(symbol);
                countT.put(t.charAt(i), ++count);
            } else {
                countT.put(t.charAt(i), 1);
            }
        }

        if (countS.size() != countT.size()) return false;

        for (Map.Entry<Character, Integer> elem : countS.entrySet()) {
            if (countT.get(elem.getKey()) == null) return false;
            if (!Objects.equals(countT.get(elem.getKey()), elem.getValue())) return false;
        }
        return true;
    }
}
