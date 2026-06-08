package tree;

public class BinarySearchTree {
    private Node root;

    public boolean insert(int value) {
        Node newNode = new Node(value);
        Node current = root;
        if (root == null) {
            root = newNode;
            return true;
        }
        while (true) {
            if (current.value == value) {
                return false;
            }

            if (current.value > value) {
                if (current.left == null) {
                    current.left = newNode;
                    return true;
                }
                current = current.left;
                //left
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return true;
                }
                current = current.right;
                //right
            }
        }
    }

    public void print(Node current) {
        if (current == null) {
            return;
        }
        System.out.println(current.value);

        print(current.left);

        print(current.right);
    }

    public Node getRoot() {
        return root;
    }

    public boolean contains(int value) {
        Node current = root;
        while (current != null) {
            if (current.value > value) {
                current = current.left;

            } else if (current.value < value) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;

    }

    class Node {
        int value;
        Node right;
        Node left;

        private Node(int value) {
            this.value = value;
        }
    }
}
