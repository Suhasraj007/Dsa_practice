import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(permutationArray("",str));
        System.out.println(NoOfPermutations("",str));
    }
    public static void permutation(String ans,String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        for(int i = 0; i <= ans.length(); i++){
            String first = ans.substring(0,i);
            String last = ans.substring(i,ans.length());
            permutation(first+ch+last,str.substring(1));
        }
    }

    public static ArrayList<String> permutationArray(String p, String up){
        ArrayList<String> ans = new ArrayList<>();

        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String last = p.substring(i,p.length());
            ans.addAll(permutationArray(first+ch+last,up.substring(1)));
        }

        return ans;
    }

    public static int NoOfPermutations(String p, String up){

        int ans = 0;

        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String last = p.substring(i,p.length());
            ans += NoOfPermutations(first+ch+last,up.substring(1));
        }

        return ans;
    }


}
