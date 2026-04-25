package sort;

import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(int[] arr) {
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        //    i
        //{6, 5, 2, 8, 3, 7};
        // j
        //   i
        //{5 2 6 8 3 7}
        // j
        for (int i = 1; i <= arr.length - 1; i++) {
            int lam = 0;
            for (int j = i - 1; j != -1; j--) {
                if (arr[j] > arr[i - lam]) {
                    int temp = arr[i - lam];
                    arr[i - lam] = arr[j];
                    arr[j] = temp;
                    System.out.println("Step number " + i + ": " + Arrays.toString(arr));
                    lam += 1;
                }

            }
        }
    }
}
