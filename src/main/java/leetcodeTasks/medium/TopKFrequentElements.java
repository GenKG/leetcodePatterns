package leetcodeTasks.medium;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {

    public static void main(String[] args) {
        topKFrequent(new int[] {-1, -1, 1, 4, 2, 2, 3},2);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (!countMap.containsKey(num)) countMap.put(num, 1);
            else countMap.put(num, countMap.get(num) + 1);
        }
        Queue<Integer> heap = new PriorityQueue<>((a,b) -> countMap.get(a) - countMap.get(b));
        for(Integer elem: countMap.keySet()){
            heap.add(elem);
            if(heap.size() > k){
                heap.poll();
            }
        }
        System.out.println("in heap: " + heap);

        return new int[]{1};
    }
}
