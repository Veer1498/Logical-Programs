package logicalPrograms;

import java.util.Scanner;
//Prime Number Program
public class PrimeNumber {
/**
 * Prime Number Class with Main function
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * If Number is not having any factors other than 1 or same Number.
		 * This is a Prime Number
		 * If Number % up to half of number is 0, loop stops.
		 * if that condition fails this is Prime.
		 * else not Prime.
		 */
		Scanner s =new Scanner(System.in);
		boolean value=false;
		System.out.println("Enter The Number");
		int Num = s.nextInt();
		System.out.println("The Number is "+Num);
		for (int i=2;i<=Num/2;i++) {
			if ( Num%i==0) {
				value = true;
				break;
			}
		}
		if (value == true) {
		System.out.println("The Number  is Not Prime");
		}
		else
		System.out.println("The Number is Prime");
	}

}
