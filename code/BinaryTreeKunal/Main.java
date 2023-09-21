import java.util.*; 
import java.io.*;

class Main {

  public static String StringChallenge(String str) {
    // code goes here  
    String [] arr = str.split(" ");
    // char [] symbols = arr[0].toCharArray();
    // char [] pattern = arr[1].toCharArray();

    int j = 0;
    for(int i = 0; i < arr[0].length(); i++){
      if(arr[0].charAt(i) == '+'){
        if(Character.isLetter(arr[1].charAt(j))){
          j++;
        }
      }else if(arr[0].charAt(i) == '$'){
        if(Integer.parseInt(""+arr[1].charAt(j)) >= 1 && Integer.parseInt(""+arr[1].charAt(j)) <= 9){
          j++;
        }
      }else if(i == arr[0].length()-1 && arr[0].charAt(i) == '*'){
        char ch = arr[1].charAt(j);
        for(int k = 1; k < 3; k++){
          if(arr[1].charAt(j+1) == ch){
            j++;
          }
        }
        j++;
      }
      else if(i != arr[0].length()-1 && arr[0].charAt(i) == '*' && arr[0].charAt(i+1) != '{'){
        char ch = arr[1].charAt(j);
        for(int k = 1; k < 3; k++){
          if(arr[1].charAt(j+1) == ch){
            j++;
          }
        }
        j++;
      }
      else if(i != arr[0].length()-1 && arr[0].charAt(i) == '*' && arr[0].charAt(i+1) == '{'){
        int num = Integer.parseInt(arr[0].charAt(i+2)+"");
        char ch = arr[1].charAt(j);
        for(int k = 1; k < num; k++){
          if(arr[1].charAt(j+1) == ch){
            j++;
          }
        }
        j++;
        i = i+2;
      }
    }

    return (j== arr[1].length())? "true" : "false";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    // Scanner s = new Scanner(System.in);
    System.out.print(StringChallenge("$****{4}+++$ 8fffbbbeeerrrrmkou")); 
  }

}