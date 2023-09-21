import java.util.LinkedList;
import java.util.Queue;

public class Successor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);    
        root.right = new TreeNode(3);    
        root.left.left = new TreeNode(4);    
        root.left.right = new TreeNode(5);
        System.out.println(successor(root, 2));    
        System.out.println(successor(root, 3));    
    }

    public static int successor(TreeNode root, int key){
        int ans = -1;

        if(root == null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode removed = q.poll();
            if (removed.left != null) {
                q.offer(removed.left);
            }
            if (removed.right != null) {
                q.offer(removed.right);
            }
            if (removed.val == key) {
                ans = q.peek().val;
                break;
            }
        }

        return ans;
    }
}
