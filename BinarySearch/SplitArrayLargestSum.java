public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        System.out.println(splitArray(arr, 2));
    }

    public static int splitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int count = 1;

            for (int nums : arr) {
                if (sum + nums > mid) {
                    sum = nums;
                    count++;
                } else {
                    sum += nums;
                }
            }

            if (count > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
