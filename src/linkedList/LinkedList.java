package linkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    //create new node
    public LinkedList(Integer value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //create new node + add Node to the end
    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
            length++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == length - 1) {
            return removeLast();
        }

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;

    }

    //create new node + add Node to beginning
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        if (index < 0 || index >= length) {
            return false;
        }

        Node current = head;
        for (int i = 0; i != index; i++) {
            current = current.next;
        }
        current.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node current = get(index - 1);

        newNode.next = current.next;
        current.next = newNode;
        length++;
        return true;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        Node current = head;

        if (head == null) {
            head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Node findMiddleNode() {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean hasLoop() {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public Node findKthFromEnd(int k) {

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null; // k is out of bounds
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public void removeDuplicates() {
        Node iNode = head;
        Node jNode = head;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j <= length; j++) {
                if (jNode.next == null) {
                    break;
                }
                if (iNode.value == jNode.next.value) {
                    Node temp = jNode.next;
                    jNode.next = temp.next;
                    temp.next = null;
                    length--;
                } else {
                    jNode = jNode.next;
                }
            }
            iNode = iNode.next;
            jNode = iNode;
        }
    }

    public void removeDuplicatesHashSet() {
        Set<Node> set = new HashSet<>();

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            set.add(temp);
            temp = temp.next;
        }

        for (Node s : set) {
            System.out.println(s.value + " -> ");
        }
    }

    public class Node {
        public int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
