import java.util.Arrays;

public class maximumSubArray {
    public static void main(String[] args) {
        int[] arr = { -10, -9, -8 };
        int[] maxSum = findMax(arr);
        System.out.println(Arrays.toString(maxSum));
    }

    // kadanes algorithm
    private static int[] findMax(int[] arr) {
        // initialize the maximum as arr[0]
        int maxSum = arr[0];
        int curSum = 0;
        // start and end index of the sub array
        int start = 0;
        int end = 0;
        int s = 0;

        // linearly traversing the array
        for (int i = 1; i < arr.length; i++) {
            // adding the element into the current sum variable
            curSum += arr[i];

            // if my currentsum is greater than the maxsum update the maxsum
            if (curSum >= maxSum) {
                maxSum = curSum;
                start = s;
                end = i;
            }
            // if we are carrying any negative sum just leave that part and move onto the
            // next subarray
            if (curSum < 0) {
                curSum = 0;
                s = i + 1;
            }
        }
        int[] result = { maxSum, start, end };
        return result;
    }
}
