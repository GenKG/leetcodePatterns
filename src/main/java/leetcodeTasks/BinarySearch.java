package leetcodeTasks;

public class BinarySearch {
    public static void main(String[] args) {
        int ourNumber = BinarySearch.searchAdvance(new int[]{-1, 2, 3, 5, 9, 12}, 2);
        int findDuplicate = BinarySearch.binarySearchDuplicate(new int[]{1, 2, 2, 3, 3, 4, 4}, 2);
    }

    public static int searchAdvance(int[] nums, int target) {
        int left = 0; // определяем левый указатель массива
        int right = nums.length - 1; // определяем правый указатель массива

        while (left <= right) { // продолжаем цикл пока два указателя не пересекутся(включая их пересечение)
            int mid = (left + right) / 2; // вычисляем середину массива

            if (nums[mid] == target) { // если наша цель находится в середине
                return mid; // возвращаем середину
            } else if (nums[mid] < target) { // если наша цель в правой части массива
                left = mid + 1; // двигаем наш левый указатель
            } else { // если наш элемент в левой части массива
                right = mid - 1; // двигаем правый указатель
            }
        }
        return -1; // ничего не нашли
    }

    public static int binarySearchDuplicate(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

}
