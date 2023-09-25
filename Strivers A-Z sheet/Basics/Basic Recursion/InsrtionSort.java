import java.util.Arrays;

public class InsrtionSort {
    public static void main(String[] args) {
        int [] arr = {4,2,5,1,4,5,2};
        sort(arr, 1,1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int r, int c) {
        if (r == arr.length) {
            return;
        }
        if (c > 0) {
            if (arr[c] < arr[c-1]) {
                int temp = arr[c];
                arr[c] = arr[c-1];
                arr[c-1] = temp;
            }
            sort(arr, r, c-1);
        }else{
            sort(arr, r+1, r+1);
        }
    }
}
