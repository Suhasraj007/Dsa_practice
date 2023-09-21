import java.util.Arrays;

public class MergeModi {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,1,2,3,4};
        int[] ans = sort(arr);
        System.out.println(arr==ans);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[]left = sort(Arrays.copyOfRange(arr,0,mid));
        int[]right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(arr,left,right);
    }

    public static int[] merge(int[] ans, int[]left, int[]right){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                ans[k] = left[i];
                i++;
                k++;
            }else{
                ans[k] = right[j];
                j++;
                k++;
            }
        }

        while(i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }
}
