import java.util.Arrays;

public class LeetCode {
    public static void main(String[] args) {
        String s = "a good   example";
        StringBuilder ans = new StringBuilder();
        s = s.trim();
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));

        for(int i = arr.length - 1; i > 0; i--){
            if(!arr[i].equals("")){
                ans.append(arr[i]);
                ans.append(" "); 
            }
        }

        ans.append(arr[0]);

        System.out.println(ans.toString());
    }
}
