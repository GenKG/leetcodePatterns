package leetcodeTasks.medium;
//https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/
public class PartitionIntoMiniumNumberOfNumbers {
    public static void main(String[] args) {
        System.out.println(minPartitions("27346209830709182346"));
    }

    public static int minPartitions(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            int ch = n.charAt(i) - '0';
            max = Math.max(max, ch);
        }
        return max;
    }
}
