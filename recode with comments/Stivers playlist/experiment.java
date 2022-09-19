public class experiment {
    public static void main(String[] args) {
        int xor = 18;
        xor = (xor & ~(xor - 1));
        System.out.println(xor);
    }
}
