public class PatternRecursion{
    public static void main(String[] args) {
         print(4, 0);
    }
    public static void print(int r, int c){
        if (r == 0) {
            return;
        }
        if(r == c) {
            System.out.println();
            print(r-1, 0);
        }else{
            System.out.print("*");
            print(r, c+1);
        }
    }
}