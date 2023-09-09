package leetcodeTasks.medium;

import java.util.Arrays;

public class LongestConsecutiveSentence {
    public static void main(String[] args) {
        longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6});
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 1) return 1;
        int maxLength = 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int countable = 1;
        for (int i = 0, j = 1; j < nums.length; j++, i++) {

            if (nums[i] < 0 && nums[j] < 0) {
                if (nums[j] + nums[i] == -1) {
                    countable++;
                }
            } else if (nums[i] < 0 && nums[j] == 0) {
                if (nums[j] + nums[i] == -1) {
                    countable++;
                }
            } else if (nums[i] >= 0 && nums[j] >= 0) {
                if (nums[j] - nums[i] == 1) {
                    countable++;
                }
            } else {
                countable = 1;
            }
            maxLength = Math.max(countable, maxLength);
        }
        return maxLength;
    }

}
