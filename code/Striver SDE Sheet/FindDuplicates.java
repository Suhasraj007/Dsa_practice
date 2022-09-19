public class FindDuplicates {
    public static void main(String[] args) {
        /*
         * constrains
         * cannot modify array
         * do it in o(1) space and o(n) time complexity
         * the array is n + 1 and elements are between 1 to n
         * one element can repeat many times
         */

        int[] arr = { 1, 2, 2, 3, 4 };
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }

    // Linked list cycle method (Floyds hare and tortoise method)
    private static int findDuplicate(int[] arr) {
        int tortoise = arr[0];
        int hare = arr[0];

        do {
            tortoise = arr[tortoise];
            hare = arr[arr[hare]];
        } while (tortoise != hare);

        hare = arr[0];
        while (tortoise != hare) {
            tortoise = arr[tortoise];
            hare = arr[hare];
        }
        return tortoise;
    }
}
