import java.util.Scanner;

public class BinaryTree {

    private Node root = null;

    // populate
    public void populate(Scanner scan) {
        System.out.println("Enter root node value : ");
        int val = scan.nextInt();
        root = new Node(val);
        populate(scan, root);
    }

    private void populate(Scanner scan, Node node) {
        System.out.println("Do u want to enter left of " + node.val);

        boolean left = scan.nextBoolean();
        if (left) {
            System.out.println("Enter the val :");
            int leftVal = scan.nextInt();
            node.left = new Node(leftVal);
            populate(scan, node.left);
        }

        System.out.println("Do u want to enter right of " + node.val);
        boolean right = scan.nextBoolean();
        if (right) {
            System.out.println("Enter the val :");
            int rightVal = scan.nextInt();
            node.right = new Node(rightVal);
            populate(scan, node.right);
        }

    }

    // preorder
    public void preOrderT() {
        preOrderT(root);
    }

    private void preOrderT(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preOrderT(node.left);
        preOrderT(node.right);
    }

    // inorder
    public void inOrderT() {
        inOrderT(root);
    }

    private void inOrderT(Node node) {
        if (node == null) {
            return;
        }
        inOrderT(node.left);
        System.out.println(node.val);
        inOrderT(node.right);
    }

    // postoerder
    public void postOrderT() {
        postOrderT(root);
    }

    private void postOrderT(Node node) {
        if (node == null) {
            return;
        }
        postOrderT(node.left);
        postOrderT(node.right);
        System.out.println(node.val);
    }

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
