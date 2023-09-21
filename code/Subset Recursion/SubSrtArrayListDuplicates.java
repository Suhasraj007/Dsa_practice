import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSrtArrayListDuplicates {
    public static void main(String[] args) {
        int[]arr = {2,1,2,2};
        System.out.println(subsetDup(arr));
    }

    public static List<List<Integer>> subsetDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start= 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int size = outer.size();

            for(int j = start; j < size; j++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
