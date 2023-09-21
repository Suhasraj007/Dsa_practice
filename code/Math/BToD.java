public class BToD {
    public static void main(String[] args) {
        int b = 1010;
        System.out.println(decimal(b));
    }

    private static int decimal(int b) {
        int ans = 0;
        int base = 1;
        while(b > 0){
            if (b % 10 == 1) {
                ans += base;
            }
            base *= 2;
            b /= 10;
        }
        return ans;
    }
}
