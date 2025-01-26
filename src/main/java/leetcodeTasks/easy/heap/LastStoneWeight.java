package leetcodeTasks.easy.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        lastStoneWeight(new int[]{2,7,4,1,8,1});
    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer elem: stones){
            heap.add(elem);
        }
        while(!heap.isEmpty()){
            if(heap.size() == 1) return heap.peek();
            int y = heap.remove();
            int x = heap.remove();
            if(x != y){
                heap.add(y - x);
            }
        }
        return 0;
    }
}
