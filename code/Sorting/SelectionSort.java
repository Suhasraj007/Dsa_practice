import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2,1,4,3,6,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int max = 0;
            int j;
            for (j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            swap(arr, max, j-1);
        }
    }
    static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
