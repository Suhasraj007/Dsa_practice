import java.util.Scanner;

public class AlternatingPrimes{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // alter(n);
        String s = scan.nextLine();
        // upperCase(s);
        minimumAppends(s);
    }
    public static void minimumAppends(String s){
        int ans = 0;
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(isPalindrome(s,i,j)) break;
            i++;
            ans++;
        }
        System.out.println(ans);
    }

    public static boolean isPalindrome(String st , int s, int e){
        while(s <= e){
            if (st.charAt(s) == st.charAt(e)) {
                s++;
                e--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void upperCase(String s){
        int upper = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upper++;
            }
        }
        System.out.println(upper);
    }
    public static void countSpaces(String s){
        // String[] arr = s.split(" ");
        // System.out.println(arr.length - 1 );

        int spaces = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                spaces++;
            }
        }
        System.out.println(spaces);
    }
    public static void alter(int n){
        boolean [] primes = new boolean[n+1];
        for(int i = 2; i * i <= n; i++){
            if(!primes[i]){
                for(int j = i * i; j <= n; j += i){
                    primes[j] = true;
                }
            }
        }

        boolean flag = true;
        for(int i = 2; i <= n; i++){
            if(!primes[i]){
                if(flag){
                    System.out.println(i);
                }
                flag = !flag;
            }
        }
    }
}