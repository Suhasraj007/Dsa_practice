public class OrderAgnosticBinarySerch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 6, 5, 4, 3, 2, 1 };
        System.out.println(orderAgnosticBinarySearch(arr, 4));
        System.out.println(orderAgnosticBinarySearch(arr2, 4));
    }

    private static int orderAgnosticBinarySearch(int[] arr, int i) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == i) {
                return mid;
            }
            if (isAsc) {
                if (i < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (i < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
