public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(16));
    }
    public static boolean isPowerOf2(int n){
        if (n == 0) {
            return false;
        }
        return (n & (n-1)) == 0;
    }
}
