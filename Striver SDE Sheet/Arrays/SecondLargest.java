import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SecondLargest{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,4355,52,26};
        System.out.println(secondLargest(arr));
        Arrays.sort(arr);    
        System.out.println(Arrays.toString(arr));
        HashSet<Integer> set = new HashSet<>();
    }

    //optimal
    public static int secondLargest(int[] nums){
        int largest = nums[0];
        int sLargest = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                sLargest = largest;
                largest = nums[i];
            }else if(nums[i] > sLargest){
                sLargest = nums[i];
            }
        }

        return sLargest;
    }

    //better
    // private static int secondLargest(int[] arr) {
    //     int largest = Integer.MIN_VALUE;

    //     for (int i : arr) {
    //         if (i > largest) {
    //             largest = i;
    //         }
    //     }

    //     int second = Integer.MIN_VALUE;

    //     for (int i : arr) {
    //         if (i > second && i != largest) {
    //             second = i;
    //         }
    //     }

    //     return second;

    // }
}