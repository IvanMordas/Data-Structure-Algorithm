import linkedlist.LinkedList;
import sort.MergeSort;
import stack.Stack;

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

        Stack nums = new Stack();
        nums.push(10);
        nums.push(20);
        nums.pop();
        nums.push(30);
        nums.push(40);
        nums.printStack();






    }

}
