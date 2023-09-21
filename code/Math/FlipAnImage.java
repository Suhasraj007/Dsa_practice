public class FlipAnImage {
    public static void main(String[] args) {
        
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] e : image){
            for(int i = 0; i < e.length / 2; i++){
                int temp = e[i] ^ 1;
                e[i] = e[e.length - i - 1] ^ 1;
                e[e.length - i -1] = e[i];
            }
        }
        return image;
    }
}
