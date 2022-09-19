import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 1, 0, 2, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    mid++;
                    low++;
                }
                case 1 -> {
                    mid++;
                }
                case 2 -> {
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }
            }
        }
    }
}