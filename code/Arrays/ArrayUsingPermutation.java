import java.util.Arrays;

public class ArrayUsingPermutation {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        arrayFormation(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void arrayFormation(int[] arr) {
        int[] temp = arr;
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[temp[i]];
        }
    }
}
