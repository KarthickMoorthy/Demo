package com.tree;


public class BSTDemo {

    public static void main(String[] args) {
        BST bt= new BST();

        bt.add(bt.root, bt.nodeCreate(10));
        bt.add(bt.root, bt.nodeCreate(12));
        bt.add(bt.root, bt.nodeCreate(11));
        bt.add(bt.root, bt.nodeCreate(13));
        bt.add(bt.root, bt.nodeCreate(6));
        bt.Search(11, bt.root);

        bt.printTree( bt.root,"");
    }

}
