package logicalPrograms;
import java.util.Scanner;

// Perfect Number 
public class PerfectNumber {
	 /**
	  * PerfectNumber Class with Main Function
	  * @param args
	  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The Sum of factors should be equal to the actual Number
		 * if that condition satisfies This is a Perfect Number.
		 * 
		 */
		Scanner s =new Scanner(System.in);
		System.out.println("Enter The Number");
		int Num = s.nextInt();
		int Sum=0;
		System.out.println("The Number is"+Num);
		for (int i=1;i<=Num/2;i++) {
			if (Num%i==0) {
				System.out.println("Divisible by "+i);
				Sum=Sum+i;
			}
		}
		System.out.println("The Sum of Factors = "+Sum);

		if(Sum==Num) {
			System.out.println("This is Perfect Numer");
			}
		else
			System.out.println("This is Not PerfecT Number");

	}

}
