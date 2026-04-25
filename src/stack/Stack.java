package stack;

public class Stack {
    private int[] arr = new int[5];
    int top = -1;
    int size;

    public Stack() {
        size = arr.length;
        top = -1;
    }

    public void push(int data) {
        top++;
        if (top < size) {

            arr[top] = data;
        } else {
            System.out.println("Stack Overflow");
        }

    }

    public int pop() {
        return arr[top--];

    }

    public void printStack() {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

}
