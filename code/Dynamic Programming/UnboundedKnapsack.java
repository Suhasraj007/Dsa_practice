import java.util.Arrays;

public class UnboundedKnapsack {
    //recursive
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.
        if(n == 0 || w == 0){
            return 0;
        }
        if(w >= weight[n-1]){
            return Math.max(profit[n-1] + unboundedKnapsack(n, w-weight[n-1], profit, weight),unboundedKnapsack(n-1, w, profit, weight));
        }else{
            return unboundedKnapsack(n-1, w, profit, weight);
        }
    }

    //memoize
    public static int unboundedKnapsack2(int n, int w, int[] profit, int[] weight) {
        int[][] dp = new int[n+1][w+1];
        for(int [] row: dp){
            Arrays.fill(row, -1);
        }
        return helper(n, w, profit, weight, dp);
    }
    public static int helper(int n, int w, int [] profit, int [] weight, int [][] dp){
        if(n == 0 || w == 0){
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }
        if(w >= weight[n-1]){
            return dp[n][w] = Math.max(profit[n-1] + helper(n, w-weight[n-1], profit, weight, dp), helper(n-1, w, profit, weight, dp));
        }else{
            return dp[n][w] = helper(n-1, w, profit, weight, dp);
        }
    }
}
