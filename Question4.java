/*Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.*/
import java.util.Scanner;
class main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of principal amount");
		int P = input.nextInt();
			System.out.println("enter the value of  rate ");
			int R = input.nextInt();
				System.out.println("enter the value of time duration");
		    int T = input.nextInt();
			int result = P*(1+R*T);
			System.out.printf("your result is : " + result );	
	}	
}