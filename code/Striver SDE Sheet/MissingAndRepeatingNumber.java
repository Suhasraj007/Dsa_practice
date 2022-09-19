
import java.util.Arrays;

public class MissingAndRepeatingNumber {
    public static void main(String[] args) {
        // int[] arr = { 1, 1, 2, 3 };
        // int[] ans = findMissingAndRepeating(arr);
        // System.out.println(Arrays.toString(ans));
        int[] arr = { 1, 1, 2, 3 };
        int[] ans = findMissingAndRepeatingXor(arr);
        System.out.println(Arrays.toString(ans));
    }

    // now using the xoring method
    private static int[] findMissingAndRepeatingXor(int[] arr) {
        int x = 0;
        int y = 0;
        int xor = arr[0];

        for (int i = 1; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        for (int i = 1; i <= arr.length; i++) {
            xor = xor ^ i;
        }

        int setBit = 0;
        setBit = xor & ~(xor - 1);

        for (int i = 0; i < arr.length; i++) {
            if ((setBit & arr[i]) != 0) {
                x = x ^ arr[i];
            } else {
                y = y ^ arr[i];
            }
        }
        for (int i = 1; i <= arr.length; i++) {
            if ((setBit & i) != 0) {
                x = x ^ i;
            } else {
                y = y ^ i;
            }
        }

        int missing = 0;
        int repeating = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                count++;
            }
        }
        if (count == 0) {
            missing = x;
            repeating = y;
        } else {
            repeating = x;
            missing = y;
        }

        int[] result = new int[2];
        result[0] = missing;
        result[1] = repeating;

        return result;
    }

    // this method does not work for very big values.
    private static int[] findMissingAndRepeating(int[] arr) {
        int[] result = new int[2];
        long sum = 0;
        long sumSquare = 0;
        long arraySum = 0;
        long arraySumSquare = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i + 1;
            sumSquare += ((i + 1) * (i + 1));
            arraySum += arr[i];
            arraySumSquare += (arr[i] * arr[i]);
        }

        long eq1 = sum - arraySum;
        long eq2 = sumSquare - arraySumSquare;

        eq2 = eq2 / eq1;

        int missing;
        int repeating;

        missing = (int) (eq2 + eq1) / 2;
        repeating = (int) (eq2 - missing);

        result[0] = missing;
        result[1] = repeating;

        return result;
    }
}
