import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,8,4,6,1,6,9};
        sort(arr, arr.length - 1, 1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[]arr, int r, int c, int max){
        if (r == 0) {
            return;
        }
        if (c <= r) {
            if (arr[c] > arr[max]) {
                max = c;
            }
            sort(arr, r, c+1, max);
        } else {
            int temp = arr[c-1];
            arr[c-1] = arr[max];
            arr[max] = temp;

            sort(arr, r-1, 1, 0);
        }
    }
}
