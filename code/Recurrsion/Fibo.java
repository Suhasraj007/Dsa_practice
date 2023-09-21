public class Fibo {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(recursionFibo(i));
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(recursionFormula(i));
        }
    }
    static long recursionFormula(int n){
        return (long)(((Math.pow(((1+Math.sqrt(5))/2),n))-(Math.pow(((1-Math.sqrt(5))/2),n)))/Math.sqrt(5));
    }
    static int recursionFibo(int n){
        if (n <= 1) {
            return n;
        }

        return recursionFibo(n-1) + recursionFibo(n-2);
    }
}
