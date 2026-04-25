import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new Random().ints(5, 0, 10).toArray();
        int target = new Random().nextInt(0, 10);

//        Arrays.sort(arr);
//        bubbleSort(arr);

        int[] arrStatic = {5, 9, 7, 3, 6};
//        insertionSort(arr);
//        selectionSort(arr);
        QuickSort.quickSort(arrStatic,0, arrStatic.length-1);

        int resultLinearSearch = linearSearch(arr, target);
        int resultBinarySearch = binarySearch(arr, target);

        System.out.println("Array is  " + Arrays.toString(arrStatic));
        System.out.println("Target element is " + target);

        if (resultBinarySearch != -1) {
            System.out.println("The index of searching element is " + resultBinarySearch);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int index = (start + end) / 2;

            if (arr[index] == target) {
                return index;
            }

            if (arr[index] > target) {
                end = index - 1;
            } else {
                start = index + 1;
            }
        }
        return -1;
    }

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
