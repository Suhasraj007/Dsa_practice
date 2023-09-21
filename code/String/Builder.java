import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Builder {
    public static void main(String[] args) {
        // StringBuilder s = new StringBuilder("imgood");
        // s.append("imgood");
        // System.out.println(s);
        // int n = -2147483648;
        // n = -(n-1);
        // System.out.println(n);

        // String a = "suhas";
        // a.contains(s);

        // lengthOfLongestSubstring("aab");

        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.empty());
    }

    public static int lengthOfLongestSubstring(String s) {
        return lengthOfLongestSubstring("", s);
    }

    public static int lengthOfLongestSubstring(String p, String up) {
        if(up.isEmpty()){
            return p.length();
        }

        if(p.contains(""+up.charAt(0))){
            return Math.max(p.length(),lengthOfLongestSubstring("", up.substring(1)));
        }

        return lengthOfLongestSubstring(p+up.charAt(0), up.substring(1));
    }

}
class MyStack {

Queue<Integer> a;
Queue<Integer> b;

public MyStack() {
    a = new LinkedList<>();
    b = new LinkedList<>();
}

public void push(int x) {
    while(!a.isEmpty()){
        b.add(a.remove());
    }
    a.add(x);
    while(!b.isEmpty()){
        a.add(b.remove());
    }
}

public int pop() {
    return a.remove();
}

public int top() {
    return a.peek();
}

public boolean empty() {
    return a.isEmpty();
}
}
