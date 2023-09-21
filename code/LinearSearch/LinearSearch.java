
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7 };
        int index = search(arr, 7);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + index + "th position");
        }
        System.out.println(boolsearch(arr, 7));
    }

    // returns true or false
    private static boolean boolsearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // returns the index of the element
    private static int search(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //
}