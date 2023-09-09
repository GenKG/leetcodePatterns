package leetcodeTasks.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        findDuplicates(new int[]{4,3,2,7,8,2,3,1});
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) res.add(index + 1);
            nums[index] = -nums[index];
        }
        return res;
    }
}
