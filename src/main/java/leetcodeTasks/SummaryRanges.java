package leetcodeTasks;

import java.util.*;

// https://leetcode.com/problems/summary-ranges/
public class SummaryRanges {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(summaryRanges2(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new LinkedList<>();
        if (nums.length == 0) {
            return res;
        }
        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                start = nums[i];
                end = nums[i];
            } else {
                if (nums[i] == end + 1) {
                    end = nums[i];
                } else {
                    process(res, start, end);
                    start = nums[i];
                    end = nums[i];
                }
            }
        }
        process(res, start, end);
        return res;
    }

    private static void process(List<String> res, int start, int end) {
        if (start == end) {
            res.add(start + "");
        } else {
            res.add(start + "->" + end);
        }
    }


    public static List<String> summaryRanges2(int[] nums) {
        List<String> arrList = new ArrayList<>();
        int a = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if ((i == nums.length - 1) || nums[i] + 1 != nums[i + 1]) {
                if (nums[i] != a) {
                    arrList.add(a + "->" + nums[i]);
                } else {
                    arrList.add(nums[i] + "");
                }
                if (i != nums.length - 1) a = nums[i + 1];
            }
        }
        new HashSet<>(new HashMap<String,String>().values());
        List<Integer> list = new ArrayList<>();

        return arrList;
    }
}
