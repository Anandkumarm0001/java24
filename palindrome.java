/*To find out whether the given number is Palindrome or not.*/
import java.util.Scanner;
class main {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int n = input.nextInt();
		int r,c, s =0 ;
	    c = n; /*kahi pe n ka value store rakhna hoga kiu ki while loop m n ka values continue change ho rha hai*/
		while(n>0){
			r = n%10;
			s = (s*10)+r;
			n = n/10;
		}
		if (c == s)
			System.out.println("number is palindrome");
		
		else 
			System.out.println("not palindrome");
		
	}
	
}