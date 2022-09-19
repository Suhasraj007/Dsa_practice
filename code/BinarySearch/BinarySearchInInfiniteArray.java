public class BinarySearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        System.out.println(searchInfi(arr, 8));
    }

    private static int searchInfi(int[] arr, int i) {
        int start = 0;
        int end = 1;

        while (i > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        int ans = binarySearch(arr, i, start, end);
        return ans;
    }

    private static int binarySearch(int[] arr, int i, int x, int y) {
        int start = x;
        int end = y;
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
