package leetcodeTasks;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int search2 = search.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        //int search1 = search.search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        //System.out.println(search1);
        int i = search.searchAdvance(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        System.out.println(i);
    }
    public int search(int[] nums, int target) {
        int targetIndex = -1;
        int[] arr = nums;
        while(arr.length > 1){
            int middleIndex = (arr.length - 1) / 2;
            int middleNumber = arr[middleIndex];
            if(target == middleNumber) {
                targetIndex = middleIndex;
                break;
            }
            if(target > middleNumber) {
                arr =  Arrays.copyOfRange(arr,middleIndex + 1,arr.length);
            }
            if(target < middleNumber) {
                arr =  Arrays.copyOfRange(arr,0,middleIndex + 1);
            }
        }
        return targetIndex;
    }

    public int searchAdvance(int[] nums, int target) {
        int left = 0; // initialize left pointer to 0
        int right = nums.length - 1; // initialize right pointer to the last index of the array

        while (left <= right) { // continue the loop till left pointer is less than or equal to right pointer
            int mid = (left + right) / 2; // calculate the middle index of the array

            if (nums[mid] == target) { // check if the middle element is equal to target
                return mid; // return the middle index
            } else if (nums[mid] < target) { // check if the middle element is less than target
                left = mid + 1; // move the left pointer to the right of middle element
            } else { // if the middle element is greater than target
                right = mid - 1; // move the right pointer to the left of middle element
            }
        }

        return -1; // target not found in the array
    }

}
