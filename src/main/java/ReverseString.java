//typical task for reverse string
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(revertString(new char[]{'H','e','l','l','o'}));
        System.out.println(minPartitions("27346209830709182346"));
    }
    //reverse string
    public static char[] revertString(char[] string){
        String word = "";
        for(int x = string.length - 1; x >= 0; x--){
            word = word + string[x];
        }
        return word.toCharArray();
    }

    //1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
    public static int minPartitions(String n) {
        int max=0;
        for(int i=0;i < n.length();i++){
            int ch=n.charAt(i)-'0';
            max=Math.max(max,ch);
        }
        return max;
    }
}
