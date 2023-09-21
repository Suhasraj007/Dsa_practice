public class CountNoOfSetBits {
    public static void main(String[] args) {
        System.out.println(setBits2(10));
    }
    public static int setBits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
    public static int setBits2(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n - (n&-n);
        }
        return count;
    }
}
