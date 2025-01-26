package leetcodeTasks.medium.prefixSum;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        productExceptSelf(new int[]{1, 2, 3, 4});
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] pref = new int[nums.length];
        int[] suff = new int[nums.length];
        int[] resultArr = new int[nums.length];
        int sumPref = 1;
        int sumSuff = 1;
        for (int i = 0; i < nums.length; i++) {
            sumPref *= nums[i];
            pref[i] = sumPref;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            sumSuff *= nums[i];
            suff[i] = sumSuff;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                resultArr[i] = suff[i + 1];
            } else if (i == nums.length - 1) {
                resultArr[i] = pref[i - 1];
            } else {
                resultArr[i] = pref[i - 1] * suff[i + 1];
            }
        }
        return resultArr;
    }

}
