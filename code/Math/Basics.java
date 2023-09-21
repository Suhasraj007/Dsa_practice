public class Basics {
    public static void main(String[] args) {
        int a = 1;
        // System.out.println(isEven(a));
        // System.out.println(Integer.toBinaryString(12));
        // System.out.println(Integer.toBinaryString(-12));
        System.out.println(noOfDigits(10, 16));
    }
    public static int noOfDigits(int n,int b){
        return (int)(Math.log(n) / Math.log(b)) + 1;
    }
    public static boolean isEven(int n){
        return (n&1) == 0;
    }
}
