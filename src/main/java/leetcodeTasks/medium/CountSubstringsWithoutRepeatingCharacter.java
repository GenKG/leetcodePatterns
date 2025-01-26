package leetcodeTasks.medium;

import java.util.Arrays;

//https://leetcode.com/problems/count-substrings-without-repeating-character/description/
public class CountSubstringsWithoutRepeatingCharacter {
    public static void main(String[] args) {
        int countStrings = numberOfSpecialSubstrings("abab");
        System.out.println(countStrings);
    }

    public static int numberOfSpecialSubstrings(String s) {

        int[] indexMap = new int[26];
        Arrays.fill(indexMap, -1);

        int count = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';
            if (indexMap[charIndex] >= start) {
                start = indexMap[charIndex] + 1;
            }
            indexMap[charIndex] = i;
            count += i - start + 1;
        }

        return count;

    }
}
