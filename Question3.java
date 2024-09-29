/*Take name as input and print a greeting message for that particular name.*/
import java.util.Scanner;
class main {
	public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	System.out.println("enter your name");
	String a = input.nextLine();
	System.out.println( a + " ji very warm good morning and have a nice day !");
	}
}