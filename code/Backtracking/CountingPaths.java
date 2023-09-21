import java.util.ArrayList;

public class CountingPaths{
    public static void main(String[] args) {
        System.out.println(paths("",0,0));
    }
    public static ArrayList<String> paths(String p, int r, int c){
        ArrayList<String> ans = new ArrayList<>();

        if (r==2&&c==2) {
            ans.add(p);
            return ans;
        }

        if (r < 2 && c < 2) {
            ans.addAll(paths(p+"C", r+1, c+1));
        }
        if (r < 2) {
            ans.addAll(paths(p+"D", r+1, c));
        }
        if (c < 2) {
            ans.addAll(paths(p+"R", r, c+1));
        }

        return ans;
    }
}