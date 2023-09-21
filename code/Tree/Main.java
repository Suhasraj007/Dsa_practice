import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // BinaryTreeKunal tree = new BinaryTreeKunal();
        // tree.treeBuilder(new Scanner(System.in));
        // tree.treeDisplay();

        BSTKunal tree = new BSTKunal();
        int[]arr = {5,2,7,1,4,3,8};
        tree.populate(arr);
        tree.display();
    }   
}