package leetcodeTasks.medium.heap;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {

    public static void main(String[] args) {
        topKFrequent(new int[] {-1, -1, 1, 4, 2, 2, 3},2);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Queue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.add(entry.getKey());
        }
        List<Integer> res = new ArrayList<>();
        int counter = 0;
        while(counter < k){
            int number = heap.remove();
            res.add(number);
            counter++;
        }

        int[] resArr = new int[res.size()];
        int i = 0;
        for(Integer elem: res){
            resArr[i] = elem;
            i++;
        }
        return resArr;
    }
}
