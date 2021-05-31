package com.app;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MyTree{
    private class TreeNode{
        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        TreeNode(int data){
            this.data=data;
        }
    }

    TreeNode root = null;

    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if(root == null)
            root = node;
        else{
            TreeNode current = root;
            while(true){
                if(data < current.data){
                    if(current.leftChild==null){
                        current.leftChild=node;
                        break;
                    }
                    current = current.leftChild;
                }
                else {
                    if(current.rightChild==null){
                        current.rightChild=node;
                        break;
                    }
                    current = current.rightChild;
                }
            }
        }
    }

    public void bft(){
        if(root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.data+" ");
            if(node.leftChild !=null)
                queue.offer(node.leftChild);
            if(node.rightChild !=null)
                queue.offer(node.rightChild);
        }
    }

    public void dft(){
        if(root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.print(node.data+" ");
            if(node.rightChild !=null)
                stack.push(node.rightChild);
            if(node.leftChild !=null)
                stack.push(node.leftChild);
        }
    }

    public void inOrder(){
        if (root==null) return;
        inOrder(root);

    }

    private void inOrder(TreeNode node){
        if(node == null)return;
        inOrder(node.leftChild);
        System.out.print(node.data+" ");
        inOrder(node.rightChild);
    }

    public void preOrder(){
        if (root==null) return;
        preOrder(root);

    }

    private void preOrder(TreeNode node){
        if(node == null)return;
        System.out.print(node.data+" ");
        preOrder(node.leftChild);
        preOrder(node.rightChild);
    }

    public void postOrder(){
        if (root==null) return;
        postOrder(root);

    }

    private void postOrder(TreeNode node){
        if(node == null)return;
        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.print(node.data+" ");
    }
}

public class Main {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(36);
        tree.insert(22);
        tree.bft();
        System.out.println("");
        tree.dft();
        System.out.println("");
        tree.preOrder();
        System.out.println("");
        tree.inOrder();
        System.out.println("");
        tree.postOrder();

    }
}
