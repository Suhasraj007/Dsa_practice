import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); //do not use the reference variable as list coz it doesnt have methods like push pop peek

        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s);

        s.pop();

        s.peek();
    }
}
