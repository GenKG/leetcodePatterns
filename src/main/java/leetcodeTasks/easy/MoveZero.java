package leetcodeTasks.easy;

import java.util.Arrays;

/**
 * # Реализовать упорядочивание массива с цифрами
 * # Вход [1,0,5,0,3,0]
 * # Результат[1,5,3,0,0,0]
 */
public class MoveZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{0,1,0,3,12})));
    }
    public static int[] sort(int[] arr){
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }
}
