package com.tree;

public class Node {
    Node right;
    Node left;
    int value;

    public Node(int value, Node left, Node right) {
        this.value=value;
        this.left=left;
        this.right=right;
    }
}
