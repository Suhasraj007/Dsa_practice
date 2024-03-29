public class SkipApple {
    public static void main(String[] args) {
        String str = "Suhasapplis";
        System.out.println(skipAppNotApple(str));
    }
    public static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skip(str.substring(5));
        }else{
            return str.charAt(0) + skip(str.substring(1));
        }
    }
    public static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }else{
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
}
