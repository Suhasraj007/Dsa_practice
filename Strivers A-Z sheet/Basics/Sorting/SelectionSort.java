import java.util.Arrays;

public class SelectionSort {
     public static void main(String[] args) {
        int [] arr = {4,2,5,1,4,5,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int max = 0;
            for (int j = 1; j < n - i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            swap(arr,max, n-i-1);
        }
    }
    public static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
