public class CountZeroes {
    public static void main(String[] args) {
        
    }
    public static int countZeroes(int n){
        return helper(n, 0);
    }
    public static int helper(int n, int c){
        if (n == 0) {
            return c;
        }
        if (n % 10 == 0) {
            return helper(n/10, c+1);
        }else{
            return helper(n/10, c);
        }
    }
}
