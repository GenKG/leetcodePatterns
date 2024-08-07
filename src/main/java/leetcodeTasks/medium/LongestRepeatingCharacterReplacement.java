package leetcodeTasks.medium;

import java.util.HashSet;

//https://leetcode.com/problems/longest-repeating-character-replacement/description/
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        characterReplacement("ABAB", 2);
    }

    public static int characterReplacement(String s, int k) {
        HashSet<Character> allLetters = new HashSet();

        // collect all unique letters
        for (int i = 0; i < s.length(); i++) {
            allLetters.add(s.charAt(i));
        }

        int maxLength = 0;
        for (Character letter : allLetters) {
            int start = 0;
            int count = 0;
            // initialize a sliding window for each unique letter
            for (int end = 0; end < s.length(); end += 1) {
                if (s.charAt(end) == letter) {
                    // if the letter matches, increase the count
                    count++;
                }
                // bring start forward until the window is valid again
                while (!isWindowValid(start, end, count, k)) {
                    if (s.charAt(start) == letter) {
                        // if the letter matches, decrease the count
                        count--;
                    }
                    start++;
                }
                // at this point the window is valid, update maxLength
                maxLength = Math.max(maxLength, end + 1 - start);
            }
        }
        return maxLength;
    }

    private static Boolean isWindowValid(int start, int end, int count, int k) {
        return end + 1 - start - count <= k;
    }
}
