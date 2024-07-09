package leetcodeTasks.medium;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class MaximizeDistanceClosestPerson {
    public static void main(String[] args) {
        //System.out.println(maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
        //System.out.println(maxDistToClosest(new int[]{1, 0, 0, 0}));
        System.out.println(maxDistToClosest(new int[]{0, 0, 1}));
    }

    public static int maxDistToClosest(int[] seats) {
        Stack stack  =new Stack();
        stack.peek();
        stack.pop();
        int maxGap = 0;
        int firstP = -1;
        for (int secondP = 0; secondP < seats.length; secondP++) {
            if (seats[secondP] == 0) continue;
            if (firstP == -1) {
                maxGap = secondP;
            } else {
                maxGap = Math.max(maxGap, (secondP - firstP) / 2);
            }
            firstP = secondP;
        }
        return Math.max(maxGap, seats.length - 1 - firstP);
    }
}
