import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 10).toArray();
        int target = new Random().nextInt(0, 10);

//        Arrays.sort(arr);
        bubbleSort(arr);

        int resultLinearSearch = linearSearch(arr, target);
        int resultBinarySearch = binarySearch(arr, target);

        System.out.println("Array is  " + Arrays.toString(arr));
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
            if (!isSwapped){
                break;
            }
                System.out.println("Step number " + i + ": " + Arrays.toString(arr));
        }
    }
}
