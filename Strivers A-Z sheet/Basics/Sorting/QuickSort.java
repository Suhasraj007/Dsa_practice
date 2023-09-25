import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {4,2,5,1,4,5,2};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int pivot = arr[(low+high)/2];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        sort(arr, low, e);
        sort(arr, s, high);
    }
    
}
