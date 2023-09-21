public class RotatingBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 1 };
        // int[] arr2 = { 4, 5, 6, 7, 1, 2, 3 };
        System.out.println(rotatedBinarySearch(arr, 0));
    }

    private static int rotatedBinarySearch(int[] arr, int target) {
        int pivot = pivot(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        } else if (target == arr[pivot]) {
            return pivot;
        } else if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    private static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int i, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (i == arr[mid]) {
                return mid;
            } else if (i < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
