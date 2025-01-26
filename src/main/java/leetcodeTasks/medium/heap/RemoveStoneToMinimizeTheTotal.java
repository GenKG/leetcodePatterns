package leetcodeTasks.medium.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RemoveStoneToMinimizeTheTotal {
    public static void main(String[] args) {
        minStoneSum(new int[]{5,4,9},2);
    }
    public static int minStoneSum(int[] piles, int k) {
        int sum = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < piles.length;i++){
            sum += piles[i];
            heap.add(piles[i]);
        }

        int count = 0;

        while(count < k){
            double stone = (double)heap.remove();
            double divide = Math.ceil(stone / 2);
            sum = sum - (int)stone + (int)divide;
            heap.add((int)divide);
            count++;
        }
        return sum;
    }
}
