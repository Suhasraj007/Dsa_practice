import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {4,2,5,1,4,5,2};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] arr, int s, int e){
        if (s >= e) {
            return;
        }

        int m = (s+e)/2;

        sort(arr, s, m-1);
        sort(arr, m, e);

        merge(arr, s, m, e);
    }

    public static void merge(int [] arr, int s, int m, int e){
        int i = s;
        int j = m;
        int k = 0;

        int [] temp = new int[e+1];

        while (i < m && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i < m) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= e) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int l = s; l <= e; l++) {
            arr[l] = temp[l-s];
        }
    }
}
