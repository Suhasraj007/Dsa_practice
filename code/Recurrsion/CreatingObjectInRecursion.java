import java.util.ArrayList;

public class CreatingObjectInRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        int target = 2;
        System.out.println(search2(arr,target,0));
    }

    public static ArrayList<Integer> search(int [] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelow = search(arr, target, index+1);

        list.addAll(ansFromBelow);

        return list;
    }

    public static ArrayList<Integer> search2(int [] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        list.addAll(search2(arr,target,index+1));

        return list;
    }

}
