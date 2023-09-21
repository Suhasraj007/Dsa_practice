import java.util.Arrays;

public class Fibo{
    public static void main(String[] args) {
        int n = 7;

        System.out.println(fibo(n));

        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fiboM(n,dp));

        System.out.println(fiboT(n, dp));

        System.out.println(fiboS(n));
    }

    //recursive
    public static int fibo(int n){
        if(n <= 1) return n;
        return fibo(n-1)+fibo(n-2);
    }

    //memoise
    public static int fiboM(int n, int [] dp){
        if (n <= 1) {
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = fiboM(n-1, dp) + fiboM(n-2, dp);
    }

    //Tabulation
    public static int fiboT(int n, int [] dp){
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    //Space optimisation
    public static int fiboS(int n){
        int prev2 = 0;
        int prev = 1;

        for(int i = 2; i <= n; i++){
            int cur = prev + prev2;
            prev2 = prev;
            prev = cur;
        }
        return prev;
    }
}