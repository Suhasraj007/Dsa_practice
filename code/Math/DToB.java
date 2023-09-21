public class DToB {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(binary(n));
    }

    private static String binary(int n) {
        String ans = "";
        for (int i = 32; i >= 0; i--) {
            int k = n >> i;
            ans += (k&1);
        }
        return ans;
    }
}
