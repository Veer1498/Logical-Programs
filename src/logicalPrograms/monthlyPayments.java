package logicalPrograms;

import java.util.Scanner;

public class monthlyPayments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Day Of Week Program");
		System.out.println("**********************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Principal amount");
		double P= sc.nextDouble();
		System.out.println("Please Enter No of Years");
		double Y= sc.nextDouble();
		System.out.println("Please Enter Rate of Percentage");
		double R= sc.nextDouble();
		double n = 12*Y;
		double r = R/(12*100);
		double payement = (P*r)/(1-Math.pow((1+r),-n));
		
		System.out.println("The Monthly Payement would be : Rs."+payement);
		

	}

}
