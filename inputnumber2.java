import java.util.Scanner;
class main {
	public static void main(String[] args){
		Scanner a1 = new Scanner(System.in);
		System.out.println("enter your first number");
		int a = a1.nextInt();
		Scanner b2 = new Scanner(System.in);
		System.out.println("enter your second number");
		int b = b2.nextInt();
		int c = a+b;
		System.out.println("sum = " + c);
	}
	
}