package linkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    //create new node
    public DoublyLinkedList(Integer value) {
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

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Head: " + tail.value);
    }

    public void getLength() {
        System.out.println("Head: " + length);
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
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
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
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        if (length == 1) {
            temp = head;
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }

        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node current = get(index);
        if (current != null) {
            current.value = value;
            return true;
        }
        return false;
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
        Node before = get(index - 1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;

        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
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

        Node temp = get(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;

        temp.next = null;
        temp.prev = null;

        length--;
        return temp;
    }

    public boolean isPalindrome() {
        if (length <= 1) {
            return true;
        }
        Node toward = head;
        Node backward = tail;

        for (int i = 0; i < length / 2; i++) {
            if (toward.value == backward.value) {
                toward = toward.next;
                backward = backward.prev;
            } else {
                return false;
            }
        }
        return true;
    }

    public void reverse() {
        if (length <= 1) {
            return;
        }

        Node current = head;
        Node temp = head.next;
        while (current != tail) {
            current.next = current.prev;
            current.prev = temp;

            current = temp;
            temp = temp.next;
        }
        current.next = current.prev;
        current.prev = null;

        temp = head;
        head = tail;
        tail = temp;
    }

    public void partitionList(int x) {
        if (head == null) {
            return;
        }
        Node D1 = new Node(0);//less
        Node D2 = new Node(0);//equal and more

        Node prev1 = D1;
        Node prev2 = D2;

        Node current = head;
        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                current.prev = prev1;
                prev1 = current;
                current = current.next;
            } else {
                prev2.next = current;
                current.prev = prev2;
                prev2 = current;
                current = current.next;
            }
        }
        prev2.next = null;

        prev1.next = D2.next;

        if (D2.next != null) {
            D2.next.prev = prev1;
            D2.next = null;
        }


        head = D1.next;
        head.prev = null;
        D1.next = null;
    }

    public class Node {
        public int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
}
