import java.io.*;
import java.util.*;

public class FacePrep {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        
        if(size1 != size2){
            System.out.println("Not Same");
            return;
        }
        
        int [] arr1 = new int[size1];
        int [] arr2 = new int[size2];
        int [] arr3 = new int[size1 + size2];

        for(int i = 0; i < size1 + size2; i++){
            if(i < size1){
                arr1[i] = scan.nextInt();
                arr3[i] = arr1[i];    
            }
            else{
                arr2[i-size1] = scan.nextInt();
                arr3[i] = arr2[i-size1];
            }
        }
        
        System.out.println(Arrays.toString(arr3));
    }
}
