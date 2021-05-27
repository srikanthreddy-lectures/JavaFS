package com.app;

class Tree{
    private class Node{
        private int data;
        private Node leftChild;
        private Node rightChild;

        Node(int data){
            this.data=data;
        }
    }

    Node root;
    //insert
    public void insert(int data){
        Node node = new Node(data);
        if(root == null){
            root = node;
        }
        else {
            Node current = root;
            while (true){
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


    public void print(){
        print("",root,false);
    }

    private void print(String prefix, Node node, boolean isLeft){
        if(node!=null){
            System.out.println(prefix + (isLeft?"(L) ":"(R) ")+node.data);
            print(prefix ,node.leftChild,true);
            print(prefix ,node.rightChild,false);
        }
    }
}

public class MyTree{
    public static void main(String[] args) throws Exception {
       Tree tree = new Tree();
       tree.insert(12);
       tree.insert(15);
       tree.insert(10);
       tree.print();

    }
}
