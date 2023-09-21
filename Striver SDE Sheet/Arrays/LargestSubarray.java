public class LargestSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1};
        longestSubarrayWithSumK(arr, 3);
    }
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxLength = 0;
        while(j < a.length){
            sum+= a[j];
            if(sum == k){
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            }else if(sum > k){
                sum -= a[i];
                i++;
            }else{
                j++;
            }
        }
        return maxLength;
    }
}
