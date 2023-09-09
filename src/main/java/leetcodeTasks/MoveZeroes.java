package leetcodeTasks;

import java.util.Arrays;
//283. Move Zeroes
public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[] {0,0,1});
    }

    public static void moveZeroes(int[] nums) {
        int dynamicLength = nums.length;
        for (int i = 0; i < dynamicLength; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < dynamicLength - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[dynamicLength - 1] = 0;
                dynamicLength--;
                i = -1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
