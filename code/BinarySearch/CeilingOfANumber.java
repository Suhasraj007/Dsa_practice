public class CeilingOfANumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8, 16, 24 };
        System.out.println(arr[ceilingOfANumber(arr, 9)]);
        System.out.println(arr[floorOfANumber(arr, 9)]);
    }

    private static int ceilingOfANumber(int[] arr, int i) {
        int start = 0;
        int end = arr.length - 1;
        if (i > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == i) {
                return mid;
            } else if (i < arr[mid]) {
                end = mid - 1;
            } else {
                start = start + 1;
            }
        }
        return start;
    }

    private static int floorOfANumber(int[] arr, int i) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == i) {
                return mid;
            } else if (i < arr[mid]) {
                end = mid - 1;
            } else {
                start = start + 1;
            }
        }
        return end;
    }
}
