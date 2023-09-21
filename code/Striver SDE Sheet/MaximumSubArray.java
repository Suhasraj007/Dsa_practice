
public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[] = { -2, 1, 4, 5, -10, 8, 4 };
        int maxSum = findMax(arr);
        System.out.println(maxSum);
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
