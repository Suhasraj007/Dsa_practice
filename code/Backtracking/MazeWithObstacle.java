import java.util.ArrayList;

public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] arr= {{true,true,true},{true,false,true},{true,true,true}};
        System.out.println(paths("",arr,0,0));
    }
    public static ArrayList<String> paths(String p,boolean[][]obstacle, int r, int c){
        ArrayList<String> ans = new ArrayList<>();

        if (r==2&&c==2) {
            ans.add(p);
            return ans;
        }

        if (r < 2 && obstacle[r][c] == true) {
            ans.addAll(paths(p+"D",obstacle, r+1, c));
        }
        if (c < 2 && obstacle[r][c] == true) {
            ans.addAll(paths(p+"R",obstacle, r, c+1));
        }

        return ans;
    }
}
