import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int [] arr = {4,2,5,1,4,5,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swapped = true;
                    swap(arr, j, j+1);
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}