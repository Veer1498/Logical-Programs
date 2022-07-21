package logicalPrograms;
import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Temperature Conversion Program");
		System.out.println("**********************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Temperature");
		double temp = sc.nextDouble();
		System.out.println("Please Select Type of Conversion \n\n1.Celcius to Farahiet \n2.Faranhiet to Celcius");
		int n = sc.nextInt();
		if(n==1) {
			double cToF = ((temp * (9/5f)) + 32);
			System.out.println("\nTemp in Faranhiet :"+cToF+" *F");
		}
		else if (n==2){
			double ftoC = ((temp - 32) * (5/9f));
			System.out.println("\nTemperature in Celcius:"+ftoC+" *C");
		}

	}

}
