package leetcodeTasks.medium;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75
public class MaximumNumberVowelsSubstringGivenLength {
    public static void main(String[] args) {
        maxVowels("abciiidef", 3);
    }

    public static int maxVowels(String s, int k) {
        List<Integer> list = List.of(1, 2, 3, 4);
        Collections.sort(list, Comparator.comparingInt(a -> Math.abs(a - 2)));
        list.subList(1, 5);
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        int firstP = 0;
        int secondP = 0;
        int maxVowels = 0;
        int count = 0;
        while (secondP <= s.length()) {
            if (secondP < s.length() && set.contains(s.charAt(secondP))) {
                count++;
            }
            int i = secondP - firstP + 1;
            if (i == k) {
                maxVowels = Math.max(count, maxVowels);
                count = 0;
                firstP++;
                secondP = firstP;
            }

            secondP++;
        }
        return maxVowels;
    }
}
