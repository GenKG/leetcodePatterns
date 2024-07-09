import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        //System.out.println(Test.countGoodSubstrings("x"));
        //System.out.println(Test.replaceDot2("1.1.1.1"));
        Test.doubleZero(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
        //System.out.println(Test.isValid("[]"));
        System.out.println(equalsMap());
    }

    public static String countGoodSubstrings(String s) {
        char[] chars = s.toCharArray();
        int firstPos = 0;
        for (int i = chars.length - 1; firstPos < i; i--) {
            char temp = chars[firstPos];
            chars[firstPos] = chars[i];
            chars[i] = temp;
            firstPos++;
        }
        return String.valueOf(chars);
    }

    //"1.1.1.1"
    public static String replaceDot(String s) {
        char[] chars = s.toCharArray();
        int newLengthArr = chars.length;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                char[] newArr = new char[newLengthArr + 2];
                newLengthArr = newArr.length;
                newArr[i - 1] = chars[i - 1];
                newArr[i] = '[';
                newArr[i + 1] = '.';
                newArr[i + 2] = ']';
                System.arraycopy(chars, i + 1, newArr, i + 3, 5);
                chars = newArr;
                i = i + 3;
            }
        }
        return String.valueOf(chars);
    }

    public static String replaceDot2(String s) {
        String[] splitWord = s.split("\\.");
        return String.join("[.]", splitWord);
    }

    public static void doubleZero(int[] arr) {
        int[] fixedArr = arr;
        int length = fixedArr.length;
        for (int i = 0; i < length; i++) {
            if (fixedArr[i] == 0) {
                for (int j = fixedArr.length - 2; j >= 0; j--) {
                    if (j >= i) {
                        fixedArr[j + 1] = fixedArr[j];
                    } else {
                        fixedArr[j] = fixedArr[j];
                    }
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(fixedArr));
    }

    public static boolean isValid(String s) {
        char[] word = s.toCharArray();
        Stack<Character> openStack = new Stack<>();
        String s1 = String.valueOf('(' + ')');
        String s2 = String.valueOf('[' + ']');
        String s3 = String.valueOf('{' + '}');
        for (int i = 0; i < word.length; i++) {
            if ((word[i] == '(') || (word[i] == '[') || (word[i] == '{')) {
                openStack.push(word[i]);
            }
            if ((word[i] == ')') || (word[i] == ']') || (word[i] == '}')) {
                String checkWord = String.valueOf(openStack.pop() + word[i]);
                if (!checkWord.equals(s1) && !checkWord.equals(s2) && !checkWord.equals(s3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean equalsMap(){
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        map1.put(1,1);
        map2.put(1,1);
        return map2.equals(map1);
    }
}

