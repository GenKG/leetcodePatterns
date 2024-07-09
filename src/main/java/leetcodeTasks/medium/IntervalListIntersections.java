package leetcodeTasks.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IntervalListIntersections {
    public static void main(String[] args) {
        intervalIntersection(new int[][]{{0, 4}, {7, 8}, {12, 19}}, new int[][]{{0, 10}, {14, 15}, {18, 20}});
        intervalIntersection(new int[][]{{4, 11}}, new int[][]{{1, 2}, {8, 11}, {12, 13}, {14, 15}, {17, 19}});
        intervalIntersection(new int[][]{{0, 5}, {12, 14}, {15, 18}}, new int[][]{{11, 15}, {18, 19}});
    }

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            // Let's check if A[i] intersects B[j].
            // lo - the startpoint of the intersection
            // hi - the endpoint of the intersection
            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);
            if (lo <= hi)
                ans.add(new int[]{lo, hi});

            // Remove the interval with the smallest endpoint
            if (A[i][1] < B[j][1])
                i++;
            else
                j++;
        }

        return ans.toArray(new int[ans.size()][]);
    }

}
