import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 10).toArray();
        int target = 7;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int result = linearSearch(arr, target);
        if(result!=-1){
            System.out.println("The index of searching element is " + result);
        }else{
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }


}
