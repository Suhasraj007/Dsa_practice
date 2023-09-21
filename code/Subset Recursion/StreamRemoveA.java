public class StreamRemoveA{
    public static void main(String[] args) {
        String str = "Suhasisa";
        System.out.println(removeBody(str,'a'));
    }
    public static String remove(String ans, String str, char r){
        if (str.isEmpty()) {
            return ans;
        }
        if (str.charAt(0) == 'a') {
            return remove(ans,str.substring(1), r);
        }else{
            ans += str.charAt(0);
            return remove(ans,str.substring(1), r);
        }
    }
    public static String removeBody(String str, char r){
        String ans = "";

        if (str.isEmpty()) {
            return ans;
        }

        if (str.charAt(0) == 'a') {
            return removeBody(str.substring(1), r);
        }else{
            ans += str.charAt(0);
            String ansFrombelow = removeBody(str.substring(1), r);
            ans = ans + ansFrombelow;
            return ans;
        }
    }
}