package sort;

import java.util.Arrays;

public class SelectionSort {
    private static void selectionSort(int[] arr) {
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        int index = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int max = arr[0];
            index = 0;
            for (int j = 1; j <= arr.length - 1 - i; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    index = j;
                }
            }
            if (index != arr.length - 1 - i) {
                int temp = arr[index];//8
                arr[index] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }

            System.out.println("Step number " + i + ": " + Arrays.toString(arr));
        }
        System.out.println("The result is : " + Arrays.toString(arr));
    }
}
