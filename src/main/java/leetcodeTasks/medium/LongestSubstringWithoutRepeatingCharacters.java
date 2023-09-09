package leetcodeTasks.medium;

import java.util.*;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abba");
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int right = 0,left = 0;right < s.toCharArray().length;right++){
            if(set.contains(s.charAt(right))){
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(s.charAt(right));
            count = Math.max(right - left + 1,count);
        }
        return count;
    }
}
