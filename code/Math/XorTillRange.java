public class XorTillRange {
    public static void main(String[] args) {
        System.out.println(xorTillRange(4));
    }
    public static int xorTillRange(int a){
        if (a % 4 == 0) {
            return a;
        }else if (a % 4 == 1) {
            return 1;
        }else if (a % 4 == 2) {
            return a+1;
        }else{
            return 0;
        }
    }
    public static int xorTillRanges(int a,int b){
        int xorB = xorTillRange(b);
        int dup = xorTillRange(a - 1);
        return xorB ^ dup;
    }
}
