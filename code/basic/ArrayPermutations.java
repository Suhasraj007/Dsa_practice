import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        helper(arr,outer, inner);
        System.out.println(outer);
    }
    
    public static void helper(int [] arr, List<List<Integer>> outer, List<Integer> inner){
        if (inner.size() == arr.length) {
            outer.add(new ArrayList<>(inner));
            return;
        }

        for(int e : arr){
            if (!inner.contains(e)) {
                inner.add(e);
                helper(arr, outer, inner);
                inner.remove(inner.size()-1);
            }
        }
    }
}
