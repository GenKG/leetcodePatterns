package ArraySort;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        var result0 = sortArray(new int[]{1, 4, 2, 6, 7, 8});
        var result = sortArray(new int[]{4, 7, 1, 2, 9, 19});
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}