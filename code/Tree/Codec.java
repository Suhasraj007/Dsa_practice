/**
 * Definition for a binary tree node.

 */
import java.util.*;
public class Codec {

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        StringBuilder ans =  new StringBuilder();
        helperE(root,ans);
        return ans.toString();
    }

    public static void helperE(TreeNode root, StringBuilder ans){
        if(root == null){
            ans.append("null,");
            return;
        }

        ans.append(root.val);
        ans.append(",");

        helperE(root.left, ans);
        helperE(root.right, ans);
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        List<String> ans = new ArrayList<>(Arrays.asList(data.split(",")));
        System.out.println(ans);
        return helperD(ans);
    }

    public static TreeNode helperD(List<String> ans){
        if(ans.get(i).charAt(0) == 'n'){
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(ans.get(i)));
        
        node.left = helperD(ans, i);
        node.right = helperD(ans, i);

        return node;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        String data = serialize(root);
        System.out.println(serialize(root));
        TreeNode ans = deserialize(data);
        System.out.println(serialize(ans));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));