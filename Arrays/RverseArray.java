import java.util.Arrays;

public class RverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));
        reverse2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int temp;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }

    static void reverse2(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
