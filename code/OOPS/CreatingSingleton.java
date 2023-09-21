public class CreatingSingleton {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj == obj2);
    }
}
