import java.lang.reflect.Array;
import java.util.*;

public class SubseqArrays {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        int[] arr = {1,2,3};
        outer.add(new ArrayList<>());
        
        for (int e : arr) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(e);
                outer.add(inner);
            }
        }

        System.out.println(outer);
    }
}
