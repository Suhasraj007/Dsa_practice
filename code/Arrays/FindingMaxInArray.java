public class FindingMaxInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 18, 9, 0, 20 };
        System.out.println(max(arr));

        System.out.println(max(arr, 3, 5));
    }

    // returns max element in the givem range
    private static int max(int[] arr, int i, int j) {
        int max = arr[i];
        for (int k = i; k <= j; k++) {
            if (arr[k] > max) {
                max = arr[k];
            }
        }
        return max;
    }

    // returns max element in the whole array
    private static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
