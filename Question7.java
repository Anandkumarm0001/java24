/*Input currency in rupees and output in USD.*/
import java.util.Scanner;
class main{
public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("rupees = ");
	float a = input.nextFloat();
	double result = a*(0.012);
	System.out.println (result);

}
}