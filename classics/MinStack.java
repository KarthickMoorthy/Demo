package classics;

import java.util.Objects;

public class MinStack {
    private  Node root;

    private int count;

    public class Node{
        private int data;
        private int min;
        private Node next;

        public Node(int data, int min) {
            this.data = data;
            this.min = min;
        }
    }

    public void push(int data){
        int min = data;

        if(!Objects.isNull(root)){
            min = Math.min(root.min,min);
        }
        Node node = new Node(data,min);
        count ++;

        node.next = root;
        root = node;

    }

    public int pop(){
        int value = root.data;
        root = root.next;
        count --;
        return value;
    }

    public int min(){
        return root.min;
    }

    public int size() {
        return count;
    }
}
