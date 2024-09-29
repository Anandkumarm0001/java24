/*keep taking number as inputs till the user enter 'x' , after that print sum of all.*/
import java.util.Scanner;
class main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
    	System.out.println("enter number enter 'x' to stop  ");
		
		while (true){
			String inputt = input.nextLine();
			if(inputt.equals("x")){
		      break;
			}
			
			int number = Integer.parseInt(inputt);
			sum+=number;
		}
		System.out.println("Sum of all number is " + sum );
	}
}