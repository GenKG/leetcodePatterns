package leetcodeTasks.easy;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
        System.out.println(nextGreatestLetter(new char[]{'x', 'x', 'y'}, 'z'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1, mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left == letters.length ? letters[0] : letters[left];
    }
}
