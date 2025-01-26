package leetcodeTasks.medium.twoPointers;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        maxOperations(new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2},3);
    }

    public  static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(k - nums[i]) && map.get(k - nums[i]) >0) {
                res++;
                map.put(k - nums[i],map.get(k - nums[i]) - 1);
            } else {
                map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            }
        }
        return res;
    }
}
