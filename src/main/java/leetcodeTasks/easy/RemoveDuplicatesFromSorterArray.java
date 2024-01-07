package leetcodeTasks.easy;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSorterArray {
    public static void main(String[] args) {
        int i = removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        int firstP = 1;
        int secondP = 1;
        while(secondP < nums.length){
            if(nums[secondP] != nums[secondP -1]){
                nums[firstP] = nums[secondP];
                firstP++;
            }
            secondP++;
        }
        return firstP;
    }
}
