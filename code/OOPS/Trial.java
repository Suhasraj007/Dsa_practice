public class Trial {
    public static void main(String[] args) {
        Integer a = 10;
        trial(a);
        a = a*10;
        System.out.println(a);
    }

    public static void trial(Integer a){
        a = a/10;
    }
}
