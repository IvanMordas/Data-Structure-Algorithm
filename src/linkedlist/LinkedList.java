package linkedlist;

public class LinkedList {
    Node head = null;


    public void add(int data) {
        Node newNode = new Node(data);
        Node current = head;

        if (head == null) {
            head = newNode;
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }


    public void printValues() {
        Node current = head;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();

        }
    }

    public void delete(int data) {
        Node current = head;
        // 5    9   78    3
        if (head.getValue() == data) {
            head = head.getNext();
            return;
        }

        while (current.getNext() != null && current.getNext().getValue() != data) {
            current = current.getNext();
        }

        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }
}
