public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 3, 0 };
        System.out.println(searchInMountain(arr, 1));
    }

    private static int searchInMountain(int[] arr, int target) {
        int peak = peakSearch(arr);
        int firstSearch = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstSearch != -1) {
            return firstSearch;
        }
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    private static int peakSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int orderAgnosticBinarySearch(int[] arr, int i, int x, int y) {
        int start = x;
        int end = y;
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
