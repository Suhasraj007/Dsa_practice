public class Solution {
    public static void main(String[] args) {
        int ans = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(ans);
    }
    public static int isPalindrome(String A) {
        A = A.trim();
        A = A.toLowerCase();
        int i = 0;
        int j = A.length() - 1;
        while(i < j){
            if(!(A.charAt(i) >= 'a' && A.charAt(i) <= 'z')){
                i++;
            }
            if(!(A.charAt(j) >= 'a' && A.charAt(j) <= 'z')){
                j--;
            }
            if(A.charAt(i) == A.charAt(j)){
                i++;
                j--;
            }else{
                return 0;
            }
        }
        return 1;
    }
}
