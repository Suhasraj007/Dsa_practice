import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>(); // double ended queue

        ad.offerFirst(2);
        ad.offerLast(3);
        ad.offer(4); // same as offer last

        System.out.println(ad);

        ad.peekFirst();
        ad.peekLast();

        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        
    }
}
