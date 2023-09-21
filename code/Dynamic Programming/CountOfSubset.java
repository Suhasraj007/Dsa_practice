import java.util.Arrays;

public class CountOfSubset {
    public static void main(String[] args) {
        int [] arr = {1,1,4,5};
        int tar = 5;
        System.out.println(findWays(arr, tar));
    }
    //tabulation
    public static int findWays(int num[], int tar) {
        // Write your code here..
        int n = num.length;
        int [][] dp = new int[n+1][tar+1];
        for (int i = 0; i < n+1; i++){
            for(int j = 0; j < tar+1; j++){
                if(i == 0){
                    dp[i][j] = 0;
                }
                if(j == 0){
                    dp[i][j] = 1;
                }
            }
        }
        for (int i = 1; i < n+1; i++){
            for(int j = 1; j < tar+1; j++){
                if( j >= num[i-1]){
                    dp[i][j] = dp[i-1][j-num[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][tar];
    }
    //memoize
    /* public static int findWays(int num[], int tar) {
        // Write your code here..
        int n = num.length;
        int [][] dp = new int[n+1][tar+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(num, n, tar, dp);
    }

    public static int helper(int [] arr, int n, int sum, int[][]dp){
        if(sum == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if(dp[n][sum] != -1){
            return dp[n][sum];
        }
        if(sum >= arr[n-1]){
            return dp[n][sum] = helper(arr, n-1, sum-arr[n-1],dp) + helper(arr, n-1, sum,dp);
        }else{
            return dp[n][sum] = helper(arr, n-1, sum, dp);
        }
    } */ 

    //recursive
    /* public static int findWays(int num[], int tar) {
        // Write your code here..
        return helper(num, num.length, tar);
    }
    public static int helper(int [] arr, int n, int sum){
        if(sum == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if(sum >= arr[n-1]){
            return helper(arr, n-1, sum-arr[n-1]) + helper(arr, n-1, sum);
        }else{
            return helper(arr, n-1, sum);
        }
    } */
}
