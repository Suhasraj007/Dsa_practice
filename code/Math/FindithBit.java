public class FindithBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        int a = 10;
        int i = 2;
        // System.out.println(findBit(a, i));
        // System.out.println(Integer.toBinaryString(resetBit(a, i)));
        System.out.println(Integer.toBinaryString(rightMostSetBit(a)));
    }
    public static int rightMostSetBit(int n){
        // n = a1b , -n = ~a1b
        return (n & -n);
    }
    public static int findBit(int n,int i){
        int mask = 1 << i-1;
        int ans = n & mask;
        ans = ans >> i-1;
        return ans;
    }
    public static int setBit(int n, int i){
        int mask = 1 << i - 1;
        int ans = n | mask ;
        return ans;
    }
    public static int resetBit(int n, int i){
        int mask = ~(1 << i - 1);
        int ans = n & mask ;
        return ans;
    }
}
