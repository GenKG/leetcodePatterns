import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OtherTasks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraysMerge(new int[]{1, 2, 3, 2, 0}, new int[]{5, 1, 2, 7, 3, 2})));
        System.out.println(Arrays.toString(unionArray(new int[]{1, 2, 3, 2, 0}, new int[]{5, 1, 2, 7, 3, 2})));
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(fibNaive(n, mem));

        System.out.println(countCharInString("AHNASHASYVYAMSJAYUVHGAUHFUHAGY"));

    }

    public static int[] arraysMerge(int[] arr1, int[] arr2) {
        System.out.println(arr1.length);
        int[] newArr = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for (int y = 0; y < arr2.length; y++) {
            int x = arr1.length + y;
            newArr[x] = arr2[y];
            x++;
        }
        return newArr;
    }
    //merge two arrays
    public static int[] unionArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int a = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (a == arr2[j]) {
                    arr1[i] = arr2[j];
                    break;
                }
            }
        }
        return null;

    }
    //fibonacci numbers
    public static long fibNaive(int n, long[] mem) {
        if (mem[n] != -1) {
            return mem[n];
        }
        if (n <= 1) {
            return n;
        }
        long result = fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
        mem[n] = result;
        return result;
    }
    //Count repeating words in a row(not optimal solution)
    public static String countCharInString(String word) {
        char[] charInWord = word.toCharArray();
        StringBuilder builder = new StringBuilder();
        Map<Character, Integer> mapChar = new HashMap<>();
        for (int i = 0; i < charInWord.length; i++) {
            if (mapChar.containsKey(charInWord[i])) {
                mapChar.put(charInWord[i], mapChar.get(charInWord[i]) + 1);
            } else
                mapChar.put(charInWord[i], 1);
        }
        for (Map.Entry<Character, Integer> elem : mapChar.entrySet()) {
            if (elem.getValue() == 1) {
                builder.append(elem.getKey());
            } else
                builder.append(elem.getKey()).append(elem.getValue());
        }
        return builder.toString();
    }

    public String reverseWords(String s) {
        String[] stringArr = s.split(" ");
        String reverseWord = "";
        for(int i = 0;i < stringArr.length; i++){
            for(int j = stringArr[i].length() - 1; j > 0; j--){
                reverseWord += stringArr[i].charAt(j);
            }
            reverseWord += " ";
        }
        return reverseWord;
    }
}
