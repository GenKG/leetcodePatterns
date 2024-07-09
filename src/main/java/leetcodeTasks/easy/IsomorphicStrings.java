package leetcodeTasks.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan-v2&envId=top-interview-150
public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("bar", "foo"));
        System.out.println(isIsomorphic("foo", "bar"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapst = new HashMap<>();
        Map<Character, Character> mapts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if (mapst.containsKey(chs) && mapst.get(chs) != cht || mapts.containsKey(cht) && mapts.get(cht) != chs)
                return false;
            mapst.put(chs, cht);
            mapts.put(cht, chs);
        }
        return true;
    }
}
