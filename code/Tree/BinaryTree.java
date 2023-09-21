import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTree {

    int index = -1;

    public Node buildTree(int[] arr) {
        index++;
        if (arr[index] == -1) {
            return null;
        }

        Node newNode = new Node(arr[index]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);

        return newNode;
    }

    public void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
    }

    public void postOrder(Node node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }

    public void levelOrder(Node node){
        if (node == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        q.offer(null);

        while(!q.isEmpty()){
            Node removed = q.poll();

            if (removed == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(removed.val);
                if (removed.left != null) {
                    q.offer(removed.left);
                }
                if (removed.right != null) {
                    q.offer(removed.right);
                }
            }
        }
    }

    //recursive solution leetcode
    // public List<List<Integer>> levelOrderT(Node root) 
    // {
    //     List<List<Integer>>al=new ArrayList<>();
    //     pre(root,0,al);
    //     return al;
    // }
    // public static void pre(Node root,int l,List<List<Integer>>al)
    // {
    //     if(root==null)
    //         return;
    //     if(al.size()==l)
    //     {
    //         List<Integer>li=new ArrayList<>();
    //         li.add(root.val);
    //         al.add(li);
    //     }
    //     else{
    //         al.get(l).add(root.val);
    //         pre(root.left,l+1,al);
    //         pre(root.right,l+1,al);
    //     }
    // } 

    public int countNodes(Node root){
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int sumOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);
    }
    
    public int heightOfTree(Node root){
        return heightOfTree(root, 0);
    }

    public int heightOfTree(Node root, int height){
        if (root == null) {
            return height;
        }
        int a = heightOfTree(root.left, height++);
        int b = heightOfTree(root.right, height++);

        return Math.max(a, b);
    }
}

class Node {
    int val;
    Node left;
    Node right;

    public Node() {

    }

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
