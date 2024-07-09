package leetcodeTasks.easy;
//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/description/
public class FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        System.out.println(findTheDistanceValue(new int[]{4,5,8},new int[]{10,9,1,8},2));
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int firstP = 0;
        int secondP = 0;
        int counter = Integer.MAX_VALUE;
        while(firstP < arr1.length){
            if(secondP > arr2.length - 1){
                secondP = 0;
                firstP++;
            }
            if(firstP < arr1.length) {
                int diff = Math.abs(arr1[firstP] - arr2[secondP]);
                if (diff <= d) {
                    Math.min(diff, counter);
                }
            }
            secondP++;
        }
        return counter;
    }
}
