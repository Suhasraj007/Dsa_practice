import java.util.Arrays;

public class MergeSortJohn {
    public static void main(String[]args){
        int[] arr = {3,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        if(arr.length == 1){
            return;
        }

        int mid = arr.length/2;

        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);

        sort(left);
        sort(right);

        merge(arr,left,right);
    }

    public static void merge(int[]arr, int[]left, int[]right){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }else{
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        while(i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}

