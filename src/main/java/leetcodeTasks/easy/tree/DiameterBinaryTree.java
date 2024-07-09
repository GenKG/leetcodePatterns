package leetcodeTasks.easy.tree;

import dataStructure.tree.TreeNode;

//https://leetcode.com/problems/diameter-of-binary-tree/description/
public class DiameterBinaryTree {
    public static void main(String[] args) {
        TreeNode v8 = new TreeNode(8,null,null);
        TreeNode v7 = new TreeNode(7,null,null);
        TreeNode v6 = new TreeNode(6,null,null);
        TreeNode v5 = new TreeNode(5,null,v6);
        TreeNode v4 = new TreeNode(4,null,null);
        TreeNode v3 = new TreeNode(3,v7,v8);
        TreeNode v2 = new TreeNode(2,v4,v5);
        TreeNode v1 = new TreeNode(1,v2,v3);
        DiameterBinaryTree diameterBinaryTree = new DiameterBinaryTree();
        diameterBinaryTree.diameterOfBinaryTree(v1);

    }

    int maxDiameter = Integer.MIN_VALUE;

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return maxDiameter;
    }
}
