public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
//        5, 9, 7, 3, 6


        //3, 5, 6, 3, 6
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int sizeL = mid - left + 1;
        int sizeR = right - mid;

        int[] arrL = new int[sizeL];
        int[] arrR = new int[sizeR];

        System.arraycopy(arr, left, arrL, 0, arrL.length);
        System.arraycopy(arr, mid + 1, arrR, 0, arrR.length);

        int i = 0;
        int j = 0;
        int k = left;

        while (i < sizeL && j < sizeR) {

            if (arrL[i] <= arrR[j]) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrR[j];
                j++;
            }
            k++;
        }

        while (i < sizeL) {
            arr[k] = arrL[i];
            i++;
            k++;
        }

        while (i < sizeR) {
            arr[k] = arrR[j];
            j++;
            k++;
        }

    }


}
