package patterns;

//Простейший алгоритм поиска подстроки в строке
public class FindSubStringInString {
    public static void main(String[] args) {
        boolean res = findSubStr("abcabbcda".toCharArray(), "cda".toCharArray());
        System.out.println(res);
    }


    public static boolean findSubStr(char[] word, char[] search) {
        int wLength = word.length;
        int sLength = search.length;
        for (int i = 0; i < wLength - sLength; i++) {
            for (int j = i, k = 0; k < sLength; j++, k++) {
                if (word[j] != search[k]) {
                    break;
                }
                if (k == sLength - 1) return true;
            }
        }
        return false;
    }
}
