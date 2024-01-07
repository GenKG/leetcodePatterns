package leetcodeTasks.easy;

//https://leetcode.com/problems/valid-mountain-array/description/
public class ValidMountainArray {
    public static void main(String[] args) {
        boolean result = validMountainArray(new int[]{0,2,3,3,4,5,4,3,2,1});
        System.out.println(result);
    }

    public static boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i + 1 < N && A[i] < A[i + 1]) {
            i++;
        }

        // peak can't be first or last
        if (i == 0 || i == N - 1)
            return false;

        // walk down
        while (i + 1 < N && A[i] > A[i + 1]) {
            i++;
        }
        return i == N - 1;
    }
}
