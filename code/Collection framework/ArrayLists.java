
import java.util.*;


public class ArrayLists{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //initial capacity 10 
        //grows its size in armotized constant time complexity
        //it increases its size by n + n/2 + 1
        //but as said by shrada didi it takes n complexity to add and remove ele inbetween coz to shift n ele to left or right
        //geting the ele at index will take O(1) time

        list.add(3); //add ele
        list.add(1,4); // add ele at index
        list.get(0); //get an ele at index
        list.set(0,2); //set an ele at index
        list.contains(2); //O(n) 

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);

        list.addAll(list2); //add a collection into another collection

        System.out.println(list); //calls toString method

        list.remove(0); //remove at index

        list.remove(Integer.valueOf(4)); //remove ele

        System.out.println(list);

        for (Integer ele : list) {
            System.out.println(ele);
        }

        //iterator class for collections
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}