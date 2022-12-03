package leetcodeTasks;

import java.util.Arrays;
import java.util.HashMap;
// https://leetcode.com/problems/two-sum/submissions/
public class TwoSums {
    public static void main(String[] args) {
        int[] arr = {1, 534, 32, 3, 423, 25, 4, 53, 345, 5, 534, 534, 5, 345, 34, 5, 34, 534, 5, 756};
        System.out.println(Arrays.toString(twoSum(new int[]{1, 534, 32, 3, 423, 25, 4, 53, 345, 5, 534, 534, 5, 345, 34, 5, 34, 534, 5, 756}, 10)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            Integer diff = target - numbers[i];
            if (hash.containsKey(diff)) {
                int toReturn[] = {hash.get(diff), i};
                return toReturn;
            }
            hash.put(numbers[i], i);
        }
        return null;
    }
}
