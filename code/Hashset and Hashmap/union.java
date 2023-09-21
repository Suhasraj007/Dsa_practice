import java.util.Arrays;
import java.util.HashSet;

public class union{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
        System.out.println(Arrays.toString(unionOfArrays(arr1, arr2)));
    }
    public static int[] unionOfArrays(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            set.add(nums2[i]);
        }

        int[] ans = set.stream()
        .mapToInt(Integer::intValue)
        .toArray();

        return ans;
    }
}