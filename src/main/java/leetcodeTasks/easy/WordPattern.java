package leetcodeTasks.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150
public class WordPattern {
    public static void main(String[] args) {
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) return false;
        Map<Character, String> charMap = new HashMap<>();
        Map<String, Character> strMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            boolean isSameCharAndEqualStr = charMap.containsKey(pattern.charAt(i)) && !charMap.get(pattern.charAt(i)).equals(arr[i]);
            boolean isSameStrAndEqualChar = strMap.containsKey(arr[i]) && strMap.get(arr[i]) != pattern.charAt(i);
            if (isSameCharAndEqualStr || isSameStrAndEqualChar) {
                return false;
            }
            charMap.put(pattern.charAt(i), arr[i]);
            strMap.put(arr[i], pattern.charAt(i));
        }
        return true;
    }
}
