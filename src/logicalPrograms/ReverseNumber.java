package logicalPrograms;

import java.util.Scanner;
// Reverse Number Program
public class ReverseNumber {
	/**
	 * 
	 * Reverse Number class with Main function
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create  a Num ,reverse as variable
		 * Took a While Loop to Change whole Number into reverse.
		 * In this Loop Traverse up to whole digits.
		 * print the final value of reverse.
		 * 
		 */
		Scanner s =new Scanner(System.in);
		System.out.println("Enter The Number");
		int Num = s.nextInt(),reverse=0;
		while (Num!=0) {
			
			int rem = Num % 10;
			reverse = reverse*10+rem;
			Num=Num/10;
		}
		System.out.println("The Reverse Number is "+reverse);

	}

}
