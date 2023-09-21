public class ReverseANumber {
    static int sum = 0;
    public static void reverse1(int n){
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum*10 + rem;
        reverse1(n/10);
    }
    public static void main(String[] args) {
        // reverse1(0);
        // System.out.println(sum);
        System.out.println(reverseKunal(123));
    }

    public static int reverseKunal(int n){
        int digits = (int)Math.log10(n) + 1;

        return helper(n,digits);
    }

    public static int helper(int n, int digits){
        if (n%10 == n) {
            return n;
        }
        return n%10 * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }

    public static int reverse2(int n){
        if (n/10 == 0) {
            return n;
        }
        return (n%10)*(int)Math.pow(10, (int)Math.log10(n)) + reverse2(n/10);
    }
    
}
