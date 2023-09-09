package patterns;
//Метод бинарного поиска
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        int a = Character.getNumericValue('a');
        int c = Character.getNumericValue('x');
        System.out.println("compare " + Character.compare('a', 'c'));
        System.out.println(a + " compare with  " + c);
        searchInsert(new int[]{1, 3, 5, 6}, 7);
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int middle = (start + end) / 2;
            if (nums[middle] < target) {
                start = middle + 1;
            }
            if (nums[middle] > target) {
                end = middle - 1;
            }
            if (target == nums[middle]) {
                return middle;
            }
        }
        return -1;
    }

    public static int searchInsert(int[] nums, int target) {
        int firstP = 0;
        int lastP = nums.length - 1;
        int mid = 0;
        while (firstP <= lastP) {
            mid = (lastP + firstP) / 2;
            if (target < nums[mid]) {
                lastP = mid - 1;
            } else if (target > nums[mid]) {
                firstP = mid + 1;
            } else {
                return mid;
            }
        }
        return nums[mid] > target ? mid : mid + 1;
    }
}
