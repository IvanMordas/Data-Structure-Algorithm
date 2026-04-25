package search;

public class BinarySearch {
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
}
