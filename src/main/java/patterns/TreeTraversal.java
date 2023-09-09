package patterns;

import dataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Базовые алгоритмы обходы дерева
public class TreeTraversal {

    public static void main(String[] args) {
        TreeNode secondNode3 = new TreeNode(2,null ,null);
        TreeNode secondNode2 = new TreeNode(3,null ,null);
        TreeNode secondNode = new TreeNode(1,secondNode2,secondNode3);


        TreeNode firstNode3 = new TreeNode(2,null ,null);
        TreeNode firstNode2 = new TreeNode(3,null ,null);
        TreeNode firstNode = new TreeNode(1,firstNode2,firstNode3);
    }

    public void dfsPreOrderRecursive(TreeNode node){
        if(node == null) return;
        System.out.println("Node with val: " + node.getVal());
        dfsPreOrderRecursive(node.getLeft());
        dfsPreOrderRecursive(node.getRight());
    }

    public void dfsInOrderRecursive(TreeNode node){
        if(node == null) return;
        dfsPreOrderRecursive(node.getLeft());
        System.out.println("Node with val: " + node.getVal());
        dfsPreOrderRecursive(node.getRight());
    }

    public void dfsPostOrderRecursive(TreeNode node){
        if(node == null) return;
        dfsPreOrderRecursive(node.getLeft());
        dfsPreOrderRecursive(node.getRight());
        System.out.println("Node with val: " + node.getVal());
    }

    public void bfsIterative(TreeNode node){
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

    public void dfsIterative(TreeNode node){
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
