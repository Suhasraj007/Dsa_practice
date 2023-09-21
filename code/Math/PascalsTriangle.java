public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(sumOfNthRow(4));
    }
    public static int sumOfNthRow(int n){
        return 1 << n - 1;
    }
}
