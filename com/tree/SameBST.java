package com.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * If two BST are same ?
 *
 * @author KarthickMoorthy
 */
public class SameBST {
    public static void main(String[] args) {
        BST bt= new BST();
        bt.add(bt.root, bt.nodeCreate(4));
        bt.add(bt.root, bt.nodeCreate(3));
        bt.add(bt.root, bt.nodeCreate(6));
        List<Integer> visited = new LinkedList<>();

        BST bt2= new BST();
        bt2.add(bt2.root, bt2.nodeCreate(6));
        bt2.add(bt2.root, bt2.nodeCreate(3));
        bt2.add(bt2.root, bt2.nodeCreate(9));

        List<Integer> visited2 = new LinkedList<>();

        bt.exploreNode(bt.root, visited);
        bt2.exploreNode(bt2.root, visited2);

        System.out.println("Visited Nodes :" + visited);
        System.out.println("Visited Nodes - Second BST: " + visited2);

        if(visited.equals(visited2))
            System.out.println("Trees are the same");
        else
            System.out.println("Trees are not the same");


    }



}
