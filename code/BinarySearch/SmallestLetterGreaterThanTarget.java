public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd' };
        System.out.println(search(arr, 'b'));
    }

    private static char search(char[] arr, char c) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (c < arr[mid]) {
                end = mid - 1;
            } else {
                start = start + 1;
            }
        }
        return arr[start % arr.length];
    }
}
