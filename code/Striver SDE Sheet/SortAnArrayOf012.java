import java.util.Arrays;

public class SortAnArrayOf012 {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 1, 2, 0, 1, 2 };
        // sort(arr);
        sortDutchAlgorithm(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortDutchAlgorithm(int[] arr) {
        int low;
        int mid;
        low = mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    // swap(arr[mid], arr[low]);
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;

                }
                case 1 -> {
                    mid++;
                }

                case 2 -> {
                    // swap(arr[mid], arr[high]);
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;

                }
            }
        }
    }

    private static void sort(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (count0 > 0) {
                arr[i] = 0;
                count0--;
            } else if (count1 > 0) {
                arr[i] = 1;
                count1--;
            } else {
                arr[i] = 2;
            }
        }

    }
}
