import java.util.Scanner;
class main{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.println("enter the year");
		int a1 = a.nextInt();
		int b = a1%4;
		if (b == 0){
			System.out.println("yes this a leaf year");
		}
		else{
			System.out.println("this is not a leaf year");
		}
		
	}
}