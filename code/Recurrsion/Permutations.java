import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        Permutations obj = new Permutations();
        
        System.out.println(obj.checkInclusion("ab", "eidboaoo"));
    }
    public boolean checkInclusion(String s1, String s2) {
        List<String> s1Permu = generatePermu("", s1);
        for(String s : s1Permu){
            if(s1Permu.contains(s)){
                return true;
            }
        }
        return false;
    }
    public List<String> generatePermu(String p, String up){
        List<String> ans = new ArrayList<>();

        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }

        for(int i = 0; i <= p.length(); i++){
            char ch = up.charAt(0);
            String first = p.substring(0,i);
            String last = p.substring(i, p.length());
            ans.addAll(generatePermu(first+ch+last, up.substring(1)));
        }

        return ans;
    }
}
