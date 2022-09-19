// import java.util.concurrent.CountDownLatch;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896 };
        findNumbers(arr);
        System.out.println(findNumbers(arr));
    }

    private static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int i) {
        return digits(i) % 2 == 0;
    }

    static int digits(int i) {
        int count = 0;
        while (i != 0) {
            count++;
            i = i / 10;
        }
        return count;
    }
}
