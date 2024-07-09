package dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode tree = getTree();
        System.out.println("inorder DFS: ------------");
        inorderDfs(tree);
        System.out.println("preorder DFS: ------------");
        preorderDfs(tree);
        System.out.println("postorder DFS: ------------");
        postorderDfs(tree);
        System.out.println("BFS iterative: -------------");
        bfsIterative(tree);
        System.out.println("DFS iterative: -------------");
        dfsIterative(tree);
    }

    public static void inorderDfs(TreeNode node) {
        if (node == null) {
            return;
        }

        inorderDfs(node.left);
        System.out.println(node.val);
        inorderDfs(node.right);
    }

    public static void preorderDfs(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.println(node.val);
        preorderDfs(node.left);
        preorderDfs(node.right);
    }

    public static void postorderDfs(TreeNode node) {
        if (node == null) {
            return;
        }

        postorderDfs(node.left);
        postorderDfs(node.right);
        System.out.println(node.val);
    }

    /**
     *          10  ---> root
     *      8        9 ---> 2 level
     *   6     7   4    5 ---> 3 level
     * @return TreeNode
     */
    public static TreeNode getTree() {
        TreeNode LeftToLeftNode3 = new TreeNode(6, null, null);
        TreeNode LeftToRightNode3 = new TreeNode(7, null, null);

        TreeNode RightLeftNode3 = new TreeNode(4, null, null);
        TreeNode RightRightNode3 = new TreeNode(5, null, null);

        TreeNode LeftToLeftNode2 = new TreeNode(8, LeftToLeftNode3, LeftToRightNode3);
        TreeNode RightToRightNode2 = new TreeNode(9, RightLeftNode3, RightRightNode3);

        TreeNode root = new TreeNode(10, LeftToLeftNode2, RightToRightNode2);
        return root;
    }


    public static void bfsIterative(TreeNode node){
        if(node == null) return;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(node);
        while (!nodeQueue.isEmpty()){
            TreeNode head = nodeQueue.poll();
            System.out.println("Doing something with node" + head.getVal());
            if(head.getLeft() != null){
                nodeQueue.offer(head.getLeft());
            }
            if(head.getRight() != null){
                nodeQueue.offer(head.getRight());
            }
        }
    }

    public static void dfsIterative(TreeNode node){
        if(node == null) return;
        Stack<TreeNode> nodeQueue = new Stack<>();
        nodeQueue.add(node);
        while (!nodeQueue.isEmpty()){
            TreeNode head = nodeQueue.pop();
            System.out.println("Doing something with node" + head.getVal());
            if(head.getLeft() != null){
                nodeQueue.push(head.getLeft());
            }
            if(head.getRight() != null){
                nodeQueue.push(head.getRight());
            }
        }
    }
}
