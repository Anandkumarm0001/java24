/* To calculate Fibonacci Series up to n numbers.*/
import java.util.Scanner;
class main {
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		System.out.println("enter a number");
		int y = n.nextInt();
		int  i = 0;
		int a = 0; 
		int b = 1;
		int c = 0;
		for(i=0; i<=y ; i++ ){
			System.out.print(a + ",");
			
		        c = a+b;
			    a = b;
				b = c;
			
			
			
		}
		
		
	}
}