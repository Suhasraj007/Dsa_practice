import java.util.Arrays;

public class PathOfBacktrack {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},{true,true,true},{true,true,true}};
        int [][] path = new int[maze.length][maze[0].length];
        backtracking("",maze,0,0,path, 1);
    }
    public static void backtracking(String p, boolean[][]maze, int r , int c, int[][]path, int steps){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = steps;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = steps;

        if(r < maze.length - 1){
            backtracking(p+"D", maze, r+1, c, path, steps+1);
        }
        if (c < maze[0].length - 1) {
            backtracking(p+"R", maze, r, c+1, path, steps+1);
        }
        if (r > 0) {
            backtracking(p+"U", maze, r-1, c, path, steps+1);
        }
        if (c > 0) {
            backtracking(p+"L", maze, r, c-1, path, steps+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
