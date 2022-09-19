import java.util.ArrayList;

public class FindDuplicates2 {
    public static void main(String[] args) {
        /*
         * constrains
         * can modify array
         * do it in o(1) space and o(n) time complexity
         * the array is n + 1 and elements are between 0 to n so return -1 if there are
         * no duplicates
         * one and more elements can repeat many times
         */

        int[] arr = { 2, 3, 1, 2, 3 };
        int[] arr2 = { 0, 1, 2, 3 };
        ArrayList<Integer> ans = findDuplicate(arr);
        ArrayList<Integer> ans2 = findDuplicate(arr2);
        System.out.println(ans);
        System.out.println(ans2);
    }

    private static ArrayList<Integer> findDuplicate(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length] += arr.length;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / arr.length >= 2) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}
