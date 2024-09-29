
/*To find out whether the given String is Palindrome or not.*/
import java.util.Scanner;
class palindrome{
  public static void main (String[] args){
  Scanner input = new Scanner(System .in);
  System.out.println("enter the string");
  String n = input.nextLine();
  int l = n.length();
  int i = 0;
  String sum = "";
  for(i = l -1 ; i>=0 ;i--){
     sum = sum + n.charAt(i);
  }
  if (sum.equals(n)){
  System.out.println("string is palindrome");
  }

  else{
  System.out.println("not palindrome");
  }
  
  }

}