public class CodingNinja {
    public static void main(String[] args) {
        // int[] A = {1,2,3,4,0};
        // int [] B = {0,4,3,2,1};
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }
    public static int minimumSwaps(int n, int[] A, int[] B) {
		// Write your code here.
		for (int i = 0; i < B.length ; i++){
			for (int j = 0; j < A.length ; j++){
				if(B[i] == A[j]){
					B[i] = j;
				}
			}
		}

		return min(B);
		
	}
	public static int min(int[]arr){
		int swap = 0;

		for (int i = 0; i < arr.length; ) {
			int crt = arr[i];
			if (arr[i] != i) {
                int temp = arr[i];
				arr[i] = arr[crt];
				arr[crt] = temp;
				swap++;
			}else{
				i++;
			}
		}

		return swap;
	}

    public static int reverse(int x) {
        int ans = 0;
        long check = 0;

        while(x != 0){
            check = (check * 10) + (x % 10);
            if(check >= Integer.MAX_VALUE){
                return 0;
            }
            ans = (ans * 10) + (x % 10);
            x = x / 10;
        }

        return ans;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size1 = nums1.length;
        int size2 = nums2.length;
        
        double avg1;
        double avg2;

        if(size1 % 2 == 0){
            int a = size1 / 2;
            int b = (size1-1) / 2;
            avg1 = (nums1[a] + nums1[b]) / 2;
        }else{
            avg1 = nums1[size1/2];
        }

        if(size2 % 2 == 0){
            int a = size2 / 2;
            int b = (size2-1) / 2;
            avg2 = (nums2[a]+nums2[b]) / 2;
        }else{
            avg2 = nums2[size2/2];
        }

        double median = (avg1 + avg2) / 2;
        return median;
    }
}
