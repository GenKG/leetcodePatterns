package leetcodeTasks;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/single-number/submissions/
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumberNaiveSolution(new int[]{2, 2, 1}));
        System.out.println(singleNumberOptimalSolution(new int[]{2, 2, 1}));
    }
    //BrutForceSolution
    public static int singleNumberNaiveSolution(int[] nums) {
        int singleNumber = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                map.put(num, 2);
            } else
                map.put(num, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                singleNumber = entry.getKey();
        }
        return singleNumber;
    }
    //XOR Solution
    public static int singleNumberOptimalSolution(int[] nums){
        int mask = 0;
        for (int num : nums) {
            mask ^= num;
        }
        return mask;
    }
}
