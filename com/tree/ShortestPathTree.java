package com.tree;

import java.util.ArrayList;

/**
 * Find the shortest path between nodes in BST.
 *
 * @author KarthickMoorthy
 */
public class ShortestPathTree {
    Node root;
    int steps = 0;
    ArrayList<Integer> visited = new ArrayList<>();

    public ShortestPathTree() {
        root=null;
    }

    public static void main(String[] args) {
        ShortestPathTree bt= new ShortestPathTree();

        bt.add(8, bt.root);
        bt.add(5, bt.root);
        bt.add(10, bt.root);
        bt.add(9, bt.root);
        bt.add(11, bt.root);
        bt.add(5, bt.root);
        bt.add(4, bt.root);
        bt.add(6, bt.root);

        bt.findPath(4, bt.root);
        bt.findPath(6, bt.root);

        bt.printTree( bt.root,"");
        System.out.println("Path:" + bt.steps);
        System.out.println("Visited Nodes :" + bt.visited);
    }

    public Node nodeCreate(int value){
        return new Node(value, null, null);
    }

    public void findPath(int searchValue, Node start){
        if(!visited.contains(start.value)){
            visited.add(start.value);
            steps++;
        } else {
            steps--;
        }
        if(start==null){
            return;
        }
        if(searchValue> start.value){
            if( start.right==null)
                return;
            else
                findPath(searchValue, start.right);
        }
        if(searchValue< start.value){
            if( start.left==null)
               return;
            else
                findPath(searchValue, start.left);
        }
    }


    public void add(int value, Node start){
        if(root==null){
            root=nodeCreate(value);
            return;
        }
        if(value> start.value){
            if( start.right==null)
                start.right=nodeCreate(value);
            else
                add(value, start.right);
        }
        if(value< start.value){
            if( start.left==null)
                start.left=nodeCreate(value);
            else
                add(value, start.left);
        }
    }

    public void printTree(Node node, String prefix)
    {
        if(node == null) return;

        System.out.println(prefix + " + " + node.value);
        printTree(node.left , prefix + " ");
        printTree(node.right , prefix + " ");
    }
}
