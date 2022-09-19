public class RotatingBinaryWithDuplicates {
    public static void main(String[] args) {
        // So this is a rotated array with duplicates
        // find the pivot first
        int[] arr = { 3, 5, 1 };
        int ans = search(arr, 3);
        System.out.println(ans);
    }

    private static int search(int[] arr, int i) {
        int start = 0;
        int end = arr.length - 1;
        // finding pivot
        int pivot = pivot(arr, start, end);

        if (pivot == -1) {
            binarySearch(arr, i, 0, arr.length - 1);
        } else if (arr[pivot] == i) {
            return pivot;
        } else if (i <= arr[start]) {
            return binarySearch(arr, i, pivot + 1, end);
        } else {
            return binarySearch(arr, i, start, pivot - 1);
        }
        return -1;
    }

    private static int pivot(int[] arr, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // pivot will be caught if its the mid in this 2 conditions
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // to check where the pivot lies on left or right of my mid
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
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
