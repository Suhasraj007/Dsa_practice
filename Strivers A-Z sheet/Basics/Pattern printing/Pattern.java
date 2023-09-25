public class Pattern {
    public static void main(String[] args) {
        // pattern3(5);
        pattern31(4);
    }

    static void pattern31(int n){
        for (int i = 1; i <= 2*n - 1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                int e = (n+1)-(Math.min(Math.min(i, j),Math.min(2*n-i, 2*n-j)));
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    static void pattern28(int n){
        for (int i = 1; i <= 2*n - 1; i++) {
            int cols = i <= n ? i : 2*n - i;
            int spaces = i <= n ? n - i : i - n;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i = 1; i <= 2*n - 1; i++) {
            int cols = i <= n ? i : 2*n - i;
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
