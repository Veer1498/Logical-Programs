package logicalPrograms;

import java.util.Scanner;

public class VendingMachine {
	public static int notes=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Vending Machine Program");
		System.out.println("**********************************");
		int [] Array = {1,2,5,10,50,100,500,1000};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Amount");
		int Amount = sc.nextInt();
		int img = 0;
		for (int i= Array.length-1;i>=0;i--) {
			if (Amount>=Array[i]) {					
					notes = Amount/Array[i];
					int temp = notes*Array[i];
					Amount = Amount - temp;	
					System.out.println("Rs."+Array[i]+"\nNo.of Notes : "+notes);
					img=img+notes;
			}
		}
		System.out.println("Total Notes Are "+img);	
	}

}
