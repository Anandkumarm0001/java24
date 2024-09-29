/* Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)*/
import java.util.Scanner;
class main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter a two number");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("enter your suitable operator ('+,*,%,/,-') to get value");
		char op = input.next().charAt(0);
		int result = 0;
		if (op == '+'){
			 result = a+b;
		}
		 else if (op == '*'){
			 result = a*b;
		}
		else if (op == '-'){
			 result = a-b;
		}
		else if (op == '%'){
			 result = a%b;
		}
		 else if (op == '/'){
			 result = a/b;
		}
		System.out.println("result is :" + result );
	}
}