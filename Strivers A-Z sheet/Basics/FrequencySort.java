import java.util.*;

public class FrequencySort{
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,2,4,4,4,5};
        printSort(arr);
    }
    public static void printSort(int [] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> {
            return b.getValue().compareTo(a.getValue());
        });
        System.out.println(list);
    }
}