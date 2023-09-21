public class APowerB {
    public static void main(String[] args) {
        System.out.println(aPowerb(3, 6));
    }
    //O{logn} time complexity
    public static int aPowerb(int a,int b){
        int ans = 1;
        while (b > 0) {
            int last = b & 1;
            if (last == 1) {
                ans = ans * a;
            }
            a = a * a;
            b = b>>1;
        }
        return ans;
    }
}
