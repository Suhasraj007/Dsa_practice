import java.util.Arrays;

public class Final{
  public static void main(String[] args) {
    // final int  a = 10;
    
    // String str = "Suhas";
    // str.replace("S","m");
    // System.out.println(str);
    Integer a = 10;
    Integer b = 20;

    swap(a,b);

    // System.out.println(a + " " + b);

    Trial obj = new Trial();
    obj.a = 15;
    // System.out.println(obj.a);
    
    Trial2 obj2 = new Trial2();
    // int[] arr2 = {4,5,6};
    // obj2.arr = arr2;
    System.out.println(Arrays.toString(obj2.arr));
  }

private static void swap(Integer a, Integer b) {
    // Integer temp = a;
    // a = b;
    // b = temp;

    a = a * 2;
}  

}

final class Trial{
    int a = 10;
}

class Trial2{
    int a = 11;
    String val = "suhas";
    final int[] arr = {1,2,3};
}