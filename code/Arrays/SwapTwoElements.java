import java.util.Arrays;

public class SwapTwoElements {
    public static void main(String[] args) {
        int[] arr = { 11, 12, 13, 14, 15, 16 };
        System.out.println(Arrays.toString(arr));
        swap(arr, -1, 5);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        if (arr == null) {
            System.out.println("Array is empty");
        }
        if (i < 0 || j >= arr.length) {
            System.out.println("not in range");
        } else {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static void swap2(int[] arr, int i, int j) {

    }
}