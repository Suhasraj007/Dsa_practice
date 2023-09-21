public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,5,2,76,34,25};
        int target = 3;
        // System.out.println(linearSearch(arr, target, 0));
        System.out.println("Index is " + linearSearch2(arr, target, 0));
    }
    public static boolean linearSearch(int[] arr, int target, int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index+1);
    }
    public static int linearSearch2(int[] arr, int target, int index){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else{
            return linearSearch2(arr, target, index+1);
        }
    }
}
