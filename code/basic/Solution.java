public class Solution {
    public static void main(String[] args) {
        int [] arr ={2,13,4,1,3,6,28};
        selectionSort(arr);
        System.out.println(arr);
    }
    public static void selectionSort(int[] arr) {
        //Your code goes here
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                int minIndex = findMin(arr, j, arr.length);
                swap(arr, i ,minIndex);
            }
        }
    }
    public static int findMin(int [] arr, int s, int e){
        int minIndex = s;
        for (int i = s+1; i < e; i++) {
            if(arr[i] < arr[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}