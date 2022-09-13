import java.util.Arrays;

public class StartAndEndOccurenceOfANumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 5, 6, };
        System.out.println(Arrays.toString(StartAndEnd(arr, 4)));
    }

    private static int[] StartAndEnd(int[] arr, int i) {
        int[] ans = { -1, -1 };
        ans[0] = search(arr, i, true);
        if (arr[0] != -1) {
            ans[1] = search(arr, i, false);
        }
        return ans;
    }

    private static int search(int[] arr, int i, boolean b) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (i == arr[mid]) {
                ans = mid;
                if (b) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (i < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
