public class BSR{
    public static void main(String[] args) {
        int[] arr = {2,5,8,12,17};
        int target = 7;
        System.out.println(binarySearchRecurssion(arr, target,0,arr.length-1));
    }
    static int binarySearchRecurssion(int[]arr, int target,int start,int end){
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecurssion(arr, target, mid+1, end);
        } else{
            return binarySearchRecurssion(arr, target, start, mid-1);
        }
    }
}