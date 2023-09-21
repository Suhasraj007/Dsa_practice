import java.util.Arrays;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1 };
        int[] ans = findMissingAndRepeating(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findMissingAndRepeating(int[] arr) {
        int[] result = new int[2]; // 0 th index = repeating, 1st index = missing

        int xorRes = arr[0]; // xor result holder variable (x^y)
        int x = 0; // bucket 1
        int y = 0; // bucket 2

        // first time xoring all the elements in the array
        for (int i = 1; i < arr.length; i++) { // 0th index is already in the variable
            xorRes = xorRes ^ arr[i];
        }
        // xoring the integers from 1 t n
        for (int i = 1; i <= arr.length; i++) { // i is integers from 1 to n
            xorRes = xorRes ^ i; // now xor contains x^y = ?
        }

        int setBit = 0;

        setBit = xorRes & ~(xorRes - 1); // extracting right most bit from xorred result

        // dividing the array elements to set or put and puting them to respective
        // buckets
        for (int i = 0; i < arr.length; i++) {
            if ((setBit & arr[i]) != 0) {
                x = x ^ arr[i]; // this is put which means their bit is different from set
            } else {
                y = y ^ arr[i]; // this is set going to bucket 2
            }
        }

        // dividing the integers from 1 to n for set or put and putting them into
        // respective bucket
        for (int i = 1; i <= arr.length; i++) {
            if ((setBit & i) != 0) {
                x = x ^ i;
            } else {
                y = y ^ i;
            }
        }

        // checking which element is repeating and missing
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                result[0] = x;
                result[1] = y;
                break;
            } else {
                result[1] = x;
                result[0] = y;
            }
        }
        return result;
    }
}
