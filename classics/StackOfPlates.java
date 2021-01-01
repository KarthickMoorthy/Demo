package classics;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackOfPlates {
    private int threshold;

    private ArrayList<Stack> stacks;

    public StackOfPlates(int threshold) {
        this.threshold = threshold;
        stacks = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stacks.add(stack);
    }

    public void push(int data){
        Stack current = getCurrentstack();
        if (current != null && current.size() < this.threshold) {
            current.add(data);
        } else {
            Stack newStack = new Stack();
            newStack.add(data);
            stacks.add(newStack);
        }
    }

    public int pop(){
        Stack current = getCurrentstack();
        if (current == null) throw new EmptyStackException();
        int data = (Integer) current.pop();

        if (current.size() == 0) {
            stacks.remove(stacks.size() - 1);
        }

        return data;
    }

    private Stack getCurrentstack() {
        return stacks.get(stacks.size()-1);
    }
}
