/*write a progrom to print a number is odd or even , also take input from the user*/
import java.util.Scanner;
class main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int a = input.nextInt();
		if(a%2==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
		
	}
}