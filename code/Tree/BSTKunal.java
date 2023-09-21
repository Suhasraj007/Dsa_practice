public class BSTKunal{
    private class Node{
        int val;
        Node left;
        Node right;
        int height;

        public Node(){

        }

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;

    public BSTKunal(){};

    public int getValue(Node node){
        if (node == null) {
            return -1;
        }
        return node.val;
    }

    public int height(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void populate(int[]nums){
        for (int i : nums) {
            insert(i);
        }
    }

    private void insert(int val){
        root = insert(val, root);
    }

    private Node insert(int val, Node root){
        if (root == null) {
            Node newNode = new Node(val);
            return newNode;
        }

        if (val < root.val) {
            root.left = insert(val, root.left);
        }

        if (val > root.val) {
            root.right = insert(val, root.right);
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        return root;
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node node){
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display(){
        display(root);
    }

    private void display(Node node){
        if (node == null) {
            return;
        }

        
        display(node.left);
        System.out.println(node.val + " ");
        display(node.right);
    }
}