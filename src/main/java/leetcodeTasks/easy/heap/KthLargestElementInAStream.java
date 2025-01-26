package leetcodeTasks.easy.heap;

import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    PriorityQueue<Integer> minHeap;
    int k;

    public KthLargestElementInAStream(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        this.k = k;

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (minHeap.size() < k || minHeap.peek() < val) {
            minHeap.add(val);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargestElementInAStream obj = new KthLargestElementInAStream(3, new int[]{4, 5, 8, 2});
        obj.add(3);
        obj.add(5);
        obj.add(10);
        obj.add(9);
        obj.add(4);
    }
}
