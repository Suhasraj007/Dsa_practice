import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ZigZagLevelOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);    
        root.right = new TreeNode(20);    
        root.right.left = new TreeNode(15);    
        root.right.right = new TreeNode(17);
        List<List<Integer>> ans = zigzagLevelOrder(root);
        System.out.println(ans);  
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> outer = new ArrayList<>();

        if(root == null){
            return outer;
        }

        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        boolean flag = false;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> inner = new ArrayList<>();
            for(int i = 0; i < size; i++){
                if(!flag){
                    TreeNode removed = q.poll();
                    inner.add(removed.val);
                    if(removed.left != null){
                        q.addFirst(removed.left);
                    }
                    if(removed.right != null){
                        q.addFirst(removed.right);
                    }
                }else{
                    TreeNode removed = q.poll();
                    inner.add(removed.val);
                    if(removed.right != null){
                        q.addFirst(removed.right);
                    }
                    if(removed.left != null){
                        q.addFirst(removed.left);
                    }
                }
            }
            flag = !flag;
            outer.add(inner);
        }

        return outer;
    }
}
