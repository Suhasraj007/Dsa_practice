import java.util.Scanner;

public class BinaryTreeKunal {
    private Node root;

    public void treeBuilder(Scanner scan){
        System.out.println("Enter root node val");
        int val = scan.nextInt();
        root = new Node(val);
        helper(root, scan);
    }

    public void helper(Node root, Scanner scan){
        System.out.println("Do u want to insert on left of " + root.val);
        boolean left = scan.nextBoolean();
        if (left) {
            System.out.println("Enter the value ");
            int val = scan.nextInt();
            Node newNode = new Node(val);
            root.left = newNode;
            helper(newNode, scan);
        }
        System.out.println("Do u want to insert on right of" + root.val);
        boolean right = scan.nextBoolean();
        if (right) {
            System.out.println("Enter the value ");
            int val = scan.nextInt();
            Node newNode = new Node(val);
            root.right = newNode;
            helper(newNode, scan);
        }
    }

    public void treeDisplay(){
        treeDisplay(root);
    }

    public void treeDisplay(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.val + " ");
        treeDisplay(root.left);
        treeDisplay(root.right);
    }

    private class Node{
        private int val;
        private Node left;
        private Node right;

        public Node(){
            
        }

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node left, Node right ){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
