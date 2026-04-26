package binaryTree;

import lombok.Data;

@Data
public class BinaryNode {
    private int data;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int data){
        this.data = data;
    }
}
