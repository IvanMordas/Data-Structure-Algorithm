package binaryTree;

public class BinaryTree {
    private BinaryNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public BinaryNode insertRec(BinaryNode root, int data) {
        if (root == null) {
            root = new BinaryNode(data);
        } else if (data < root.getData()) {
            root.setLeft(insertRec(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(insertRec(root.getRight(), data));
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);

    }

    public void inorderRec(BinaryNode root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.print(root.getData() + " ");
            inorderRec(root.getRight());
        }
    }


}
