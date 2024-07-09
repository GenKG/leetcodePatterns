package patterns;

//typical task for reverse string
public class ReverseString {
    public static void main(String[] args) {
        char[] wordArr = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(revertString(wordArr));
        System.out.println(reverseString(wordArr));

    }

    //with concat
    public static char[] revertString(char[] string) {
        String word = "";
        for (int x = string.length - 1; x >= 0; x--) {
            word = word + string[x];
        }
        return word.toCharArray();
    }
    //with two pointers
    public static char[] reverseString(char[] arr){
        int firstP = 0;
        int secondP = arr.length - 1;
        while(firstP < secondP){
            char temp  = arr[firstP];
            arr[firstP] = arr[secondP];
            arr[secondP] = temp;
            firstP++;
            secondP--;
        }
        return arr;
    }
}
