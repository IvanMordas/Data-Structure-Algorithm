package linkedlist;

import lombok.Data;

@Data
public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
