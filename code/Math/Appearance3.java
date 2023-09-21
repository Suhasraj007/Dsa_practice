public class Appearance3 {
    public static void main(String[] args) {
        int[]arr = {1,1,1,3,3,3,10,10,10,7};
        int[]arr2 = {2,3,4,1,1,2,3,6,4};
        // System.out.println(appearance2(arr2));
        System.out.println(detect(arr,3));
    }

    public static int appearance2(int[]arr){
        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }
        return ans;
    }

    public static int detect(int[]arr,int repeatationTime){
        int[] setBitArray = new int[32];
        for (int i : arr) {
            int index = 0;
            while(i > 0){
                setBitArray[index] += i & 1;
                i = i >> 1;
                index++;
            }
        }
        for (int i= 0; i < setBitArray.length; i++) {
            setBitArray[i] %= repeatationTime; 
        }

        int ans = 0;
        for (int i = 0; i < setBitArray.length; i++) {
            ans += setBitArray[i] * (int)Math.pow(2, i);
        }
        return ans;
    }
}
