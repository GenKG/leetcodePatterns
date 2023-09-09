package leetcodeTasks;
//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        validPalindrome.isPalindrome("A man, a plan, a canal: Panama");
    }
    public boolean isPalindrome(String s) {
        if(s.equals(" ")) return true;
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        String reverseStr = reverseString(s);
        if(reverseStr.equals(s)) return true;
        return false;
    }
    public String reverseString(String s){
        int pointer = 0;
        char[] arr = s.toCharArray();
        for(int i = arr.length - 1; pointer < i;i--){
            char temp = s.charAt(i);
            arr[i] = arr[pointer];
            arr[pointer] = temp;
            pointer++;
        }
        return String.valueOf(arr);
    }
}
