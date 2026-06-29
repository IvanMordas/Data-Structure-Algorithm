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

    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }

        if (currentNode.value == value) {
            return true;
        }

        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        }

        if (value > currentNode.value) {
            return rContains(currentNode.right, value);
        }
        return false;
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        rInsert(root, value);
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
