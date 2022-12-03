package patterns;

public class SlidingWindows {

    public static void main(String[] args) {
        System.out.println(max_sub_array_of_size_k(5,new int[]{1, 5, 3, 6, 8, 3, 6, 8, 0, 3, 6}));
    }
    public static int max_sub_array_of_size_k(int k, int[] arr) {
        int maxSum = 0;
        int windowSum = 0;
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            windowSum += arr[end];
            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[start];
                start++;
            }
        }
        return maxSum;
    }
}
