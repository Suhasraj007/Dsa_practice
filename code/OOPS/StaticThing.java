public class StaticThing {

    public static void main(String[] args) {
        // System.out.println(b);
    }
}

class another{
    static int a = 10;
    static int b;

    static{
        b = 20;
        System.out.println("Executed");
    }
}
