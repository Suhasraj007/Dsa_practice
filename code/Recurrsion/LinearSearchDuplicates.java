import java.util.ArrayList;

public class LinearSearchDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = search(arr, target, 0, list);
        System.out.println(ans);
        System.out.println(ans == list);
    }
    public static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return search(arr, target, index+1, list);
    }
}
