import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        //the methods are the same as the queue 
        Queue<Integer> pq = new PriorityQueue<>(); //this is a min heap
        Queue<Integer> pqmax = new PriorityQueue<>(Comparator.reverseOrder()); //this is a max heap

        pq.offer(5); //it uses heapify algo to store the elements and we know it takes O(n)
        pq.offer(4);
        pq.offer(2);
        pq.offer(1);
        pq.offer(3);

        System.out.println(pq);

        pq.poll(); //removes the smallest ele coz its min heap

        System.out.println(pq);
    }
}
