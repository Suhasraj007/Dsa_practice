import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>(); //all operations O(1)
        Set<Integer> st2 = new LinkedHashSet<>(); //maintains the order in which elements were added 
        Set<Integer> st3 = new TreeSet<>(); // stores everything in sorted order, O(logn) time complexity

        st.add(32);
        st.add(2);
        st.add(54);
        st.add(21);
        st.add(8);
        st.add(4);
        st.add(12);

        System.out.println(st);

        st.remove(32);

        st.contains(2);

        Set<Student> studentSet = new HashSet<>();

        Student obj = new Student(1,"Suhas");
        Student obj2 = new Student(1,"Suhas");
        studentSet.add(obj);
        studentSet.add(obj2);

        System.out.println(studentSet);
    }
}
