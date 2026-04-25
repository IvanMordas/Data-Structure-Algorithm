import linkedlist.LinkedList;
import sort.MergeSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new Random().ints(5, 0, 10).toArray();
        int target = new Random().nextInt(0, 10);
        int[] arrStatic = {5, 9, 7, 3, 6};

        System.out.println("Before Sorting   " + Arrays.toString(arrStatic));

        MergeSort.mergeSort(arrStatic, 0, arrStatic.length - 1);

        System.out.println("After sorting:  " + Arrays.toString(arrStatic));

        LinkedList nums = new LinkedList();

        nums.add(5);
        nums.add(9);
        nums.add(78);

        nums.addFirst(1);
        nums.delete(1);
        nums.printValues();






    }

}
