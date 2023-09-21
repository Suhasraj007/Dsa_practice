public class BinarySearchSQRT {
    public static void main(String[] args) {
        int number = 89;
        int precision = 3;
        System.out.println(Math.sqrt(number));
        System.out.printf("%.3f",sqrt(number, precision));
    }
    public static double sqrt(int n , int p){
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m*m == n) {
                return m;
            }else if(m*m > n){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }

        root = e;
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                if (root * root == n) {
                    return root;
                }
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
