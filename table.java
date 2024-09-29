import java.util.Scanner;
class main{
	public static void main(String[] arg){
	Scanner input = new Scanner(System.in);
	System.out.println("please enter your number");
	int a = input.nextInt();
	for(int i=1;i<=10;i++ ){
		System.out.println(a + "*" + i +"=" + a*i );
	}
	}	
	}
