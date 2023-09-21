import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(combinations("","12"));
    }
    public static List<String> combinations(String p, String up){
        List<String> ans = new ArrayList<>();

        if(up.isEmpty()){
            if(p != ""){
                ans.add(p);
                return ans;
            }
        }

        int digit = up.charAt(0) - '0';

        for(int i = (digit-1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            ans.addAll(combinations(p+ch,up.substring(1)));
        }

        return ans;
        
    }
}
