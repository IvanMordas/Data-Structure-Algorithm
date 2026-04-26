
import binaryTree.BinaryTree;
import sort.MergeSort;

import java.util.Arrays;
import java.util.Random;

//import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        int[] arr = new Random().ints(5, 0, 10).toArray();
        int target = new Random().nextInt(0, 10);
        int[] arrStatic = {5, 9, 7, 3, 6};

        System.out.println("Before Sorting   " + Arrays.toString(arrStatic));

        MergeSort.mergeSort(arrStatic, 0, arrStatic.length - 1);

        System.out.println("After sorting:  " + Arrays.toString(arrStatic));

        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        tree.inorder();



    }

}
