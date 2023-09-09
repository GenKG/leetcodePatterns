package leetcodeTasks.easy;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int n) {
        int start = 0;
        int[] arr = new int[n + 1];
        while (start <= n) {
            int i = start | 1;
            arr[start] = i;
            start++;
        }

        return arr;
    }
}
