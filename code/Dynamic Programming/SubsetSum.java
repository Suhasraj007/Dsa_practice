public class SubsetSum{
    public static void main(String[] args) {
        
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        //tabulation
        boolean [][] dp = new boolean[n+1][k+1];
        //dp initialisation, can form 0 weight with any no of ele so 0th col all true 
        //with 0 no of ele cant form any +ve sum so 0th row false
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < k+1; j++){
                if(i == 0){
                    dp[i][j] = false;
                }
                if(j == 0){
                    dp[i][j] = true;
                }
            }
        }

        //recursion to iterative take one leave one
        for(int i = 1; i < n+1 ; i++){
            for(int j = 1; j < k+1; j++){
                if(j >= arr[i-1]){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][k];
    }
    //memoize
    /*  public static boolean helper(int[]arr, int k, int n, int[][]dp){
            if(k == 0){
                return true;
            }
            if (n == 0) {
                return false;
            }
            if(dp[n][k]!=-1){
                return dp[n][k]==0?false:true;
            }
            if(k >= arr[n-1]){
                dp[n][k] = (helper(arr, k-arr[n-1], n-1, dp) || helper(arr, k, n-1, dp))? 1:0;
                return (dp[n][k] == 1)? true: false;
            }else{
                dp[n][k] = (helper(arr, k, n-1, dp))?1:0;
                return (dp[n][k] == 1)? true: false;
            }
    } */
}

//recursive solution
/* if(k == 0){
       return true;
    }
    if(n == 0){
        return false;
    }
    if(k >= arr[n-1]){
        return subsetSumToK(n-1, k-arr[n-1], arr) || subsetSumToK(n-1, k, arr);
    } else{
        return subsetSumToK(n-1, k, arr);
    }
*/