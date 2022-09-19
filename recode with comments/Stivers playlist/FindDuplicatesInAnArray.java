import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 3 };
        int ans = findDuplicate(arr);
        System.out.println(ans);
        int[] arr2 = { 1, 1, 3, 3, 2 };
        List<Integer> ans2 = findManyDupliacte(arr2);
        System.out.println(ans2);
    }

    // for many duplicate elements and can modify the array
    private static List<Integer> findManyDupliacte(int[] arr2) {
        // here we can modify our array so we will use some maths
        List<Integer> result = new ArrayList<>();

        int size = arr2.length;

        for (int i = 0; i < size; i++) {
            // we use mod size for index bcoz once modified it will reach out of bounds if
            // we dont use mod size.
            int index = arr2[i] % size;
            // assume you have 2 as 0th element we get 2 mod size as 2 itself and then go to
            // the 2nd index and add size of the array.
            arr2[index] += size;
        }
        // now we have the modified array
        for (int i = 0; i < arr2.length; i++) {
            // if the particular element of the array is divided by the size, we know that
            // only if the size has been added twice or more at that particular position
            // we will get the quotient more than 2.
            if (arr2[i] / size >= 2) {
                // we add i bcoz we know that the index here itself is the element in the upper
                // loop
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }

    private static int findDuplicate(int[] arr) {
        int tortoise = arr[0];
        int hare = arr[0];

        // we are using do while because at the begining my tortoise and hare
        // are same so it will never enter the loop if its just a simple while loop
        do {
            hare = arr[arr[hare]];
            tortoise = arr[tortoise];
        } while (tortoise != hare);

        hare = arr[0];

        while (tortoise != hare) {
            hare = arr[hare];
            tortoise = arr[tortoise];
        }

        return tortoise;
    }

}