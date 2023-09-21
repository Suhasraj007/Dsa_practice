import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
       TreeNode left;
      int val;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class LeetCode {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        List<List<Integer>> ans = levelOrder(root);
        System.out.println(ans);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
       if(root == null){
           return null;
       }

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> outer = new ArrayList<>();
        
        q.offer(root);
        q.offer(null);

        List<Integer> inner = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode removed = q.poll();
            if(removed == null){
                outer.add(inner);
                inner.clear();
                if(q.isEmpty()){
                    break;
                }else{
                    q.offer(null);
                }
            }else{
                inner.add(removed.val);
                if(removed.left != null){
                    q.offer(removed.left);
                }
                if(removed.right != null){
                    q.offer(removed.right);
                }
            }
        }

        return outer;

    }
}

