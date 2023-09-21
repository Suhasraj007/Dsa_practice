import java.util.ArrayList;

public class SubsetMethod {
    public static void main(String[] args) {
        String str = "abc";
        // subset("",str);
        System.out.println(subsetKunal("",str));
    }
    public static void subset(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        subset(ans+str.charAt(0),str.substring(1));
        subset(ans,str.substring(1));
    }
    
    public static ArrayList<String> subsetAdd(String ans, String str){
        ArrayList<String> list = new ArrayList<>();

        if(str.isEmpty()){
            if(ans != ""){
                list.add(ans);
            }
            return list;
        } 

        list.addAll(subsetAdd(ans+str.charAt(0),str.substring(1)));
        list.addAll(subsetAdd(ans,str.substring(1)));

        return list;
    }
    public static ArrayList<String> subsetKunal(String ans, String str){
    
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(ans != ""){
                list.add(ans);
            }
            return list;
        } 

        ArrayList<String> left = subsetAdd(ans+str.charAt(0),str.substring(1));
        ArrayList<String> right = subsetAdd(ans,str.substring(1));

        left.addAll(right);

        return left;
    }
}
