package classics;

import java.util.Objects;

public class BinaryTree {

    private Node root;

    public class Node{
        int key;
        Node right;
        Node left;

        public Node(int key) {
            this.key = key;
        }

        public Node copy(){
            Node node = new Node(key);

            // Deep Copy
            if(Objects.nonNull(this.right)){
                node.right = this.right.copy();
            } else if(Objects.nonNull(this.left)){
                node.left = this.left.copy();
            }
            return  node;
        }
    }

  public void inOrdertraversal(){
        printInOrderTraversal(root);

    }

    private void printInOrderTraversal(Node root) {
        if(root != null){
            printInOrderTraversal(root.left);
            System.out.println(root.key);
            printInOrderTraversal(root.right);

        }
    }
}
