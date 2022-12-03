package leetcodeTasks;

import java.util.Arrays;
//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquartedOfSortedArray {
    public static void main(String[] args) {
        System.out.println((Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10}))));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }
}
