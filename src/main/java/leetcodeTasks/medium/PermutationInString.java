package leetcodeTasks.medium;

import java.util.Arrays;
import java.util.HashMap;

public class PermutationInString {
    public static void main(String[] args) {
        //checkInclusion("ab", "eidboaoo");
        checkInclusion("ooa", "eidboaoo");
    }

    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int[] freq = new int[26];
        int m = s2.length();
        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int[] freq2 = new int[26];
        for (int i = 0; i < m; i++) {
            freq2[s2.charAt(i) - 'a']++;
            //Если мы вышли за пределы нашего окна, но все еще не получили символы, значит нужно его сдвинуть
            //Для этого удаляем левый элемент из массива 2
            if (i >= n) {
                freq2[s2.charAt(i - n) - 'a']--;
            }
            if (Arrays.equals(freq, freq2))
                return true;
        }
        return false;
    }


}
