package leetcodeTasks.medium;

//https://leetcode.com/problems/string-compression/description/
public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    public static int compress(char[] chars) {
        int firstP = 0;
        int secondP = 0;
        int count = 0;
        int trackCount = 0;
        while (secondP < chars.length) {
            while (secondP < chars.length && chars[firstP] == chars[secondP]) {
                count++;
                secondP++;
            }
            trackCount++;
            firstP = secondP;
            if (count > 1) {
                String strCount = String.valueOf(count);
                for (Character charNumber : strCount.toCharArray()) {
                    chars[trackCount] = charNumber;
                    trackCount++;
                }
            }
            if (secondP != chars.length) {
                chars[trackCount] = chars[secondP];
            }
            count = 0;

        }
        return trackCount;
    }
}
