import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        System.out.println(dice("",4));
    }
    public static List<String> dice(String p, int up){
        List<String> ans = new ArrayList<>();

        if (up == 0) {
            if (p != "") {
                ans.add(p);
                return ans;
            }
        }

        for (int i = 1; i <= up; i++) {
            ans.addAll(dice(p+i, up-i));
        }
        return ans;
    }
}
