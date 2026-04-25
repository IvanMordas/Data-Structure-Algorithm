package sort;

import java.util.Arrays;

public class BubbleSort {
    private static void bubbleSort(int[] arr) {
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
            System.out.println("Step number " + i + ": " + Arrays.toString(arr));
        }
    }
}
