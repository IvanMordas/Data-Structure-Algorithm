package task;

public class MyQueue {
    private StackArrayList<Integer> stack1;
    private StackArrayList<Integer> stack2;

    public MyQueue() {
        stack1 = new StackArrayList<>();
        stack2 = new StackArrayList<>();
    }

    public void enqueue(int value){
        stack1.push(value);
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}

