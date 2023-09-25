import java.util.*;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); //can be implemented using linkedlist and arraydeque class, queue is an interface like list
        Queue<Integer> q2 = new ArrayDeque<>();  //to add and remove at ends arraydeque is faster, linkedlist is faster when we try to remove element in the middle which is not the use case of the queue

        q.offer(1); //used to add element in the queue 
        q.offer(2); // we can also use the add method but if it fails it throws an IO exception
        q.offer(3); // but offer method just returns true or false

        System.out.println(q);

        q.peek(); // to see the first element

        q.poll(); //used to remove an ele in the queue same as remove method but doesnt throw exception

        System.out.println(q.size());
    }
}
