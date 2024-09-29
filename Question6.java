/*Take 2 numbers as input and print the largest number.*/
import java.util.Scanner;
class main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter two number first and second");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a>b){
			System.out.println( a + " is greater ! ");
			}
	    else if(a==b){
		    System.out.println( " both numbers are equal ! ");		
		}
         else{
			System.out.println( b + " is greater ! " ); 
		 }		
		}	
}
