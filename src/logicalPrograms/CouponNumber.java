package logicalPrograms;

import java.util.ArrayList;
import java.util.Scanner;

//Coupon Number Program
public class CouponNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				/*
				 * Welcoming the User
				 * Taken Variables number,numbers,count
				 * Taken a FOR Loop for Scanning the N numbers of user 
				 * Added a WHILE Loop to check the Input Numbers by Random Numbers
				 * By Using Count, We can check the number of Iterations
				 * Taken If Condition to check if (Number = Random Number) or not
				 * Taken an ArrayList to store the Random Numbers to Print at last.
				 * if condition is YES, It will break and store to Array.
				 * At last, We will get the count value and print How many Random Numbers taken to guess Input Nmber
				 */
				System.out.println("WELCOME TO COUPON NUMBER CHECKER");
				System.out.println("");
				int number,numbers=0,count=1;
				System.out.println("Enter How Many Numbers You Want to Input");
				Scanner sc = new Scanner(System.in);
				number = sc.nextInt();
				ArrayList<Integer> arrayList = new ArrayList<Integer>(number);
				System.out.println("Enter 3 Numbers (Between 100-999) and Press ENTER");
				for(int i =1 ; i<=number;i++) {
					Scanner sc2 = new Scanner(System.in);
					numbers = sc2.nextInt();
					while(number!=0){
							count=count+1;
							int random =(int) Math.floor(Math.random()*(999)+100);
							if(random == numbers) {
								arrayList.add(random);
								break;
							}
					}
			
				}	
				System.out.println("Numbers you Entered : ");
				System.out.println("");
				for (int i=0;i<number;i++) {
					int current = arrayList.get(i);
					System.out.println(current);
					System.out.println("");
				}
				System.out.println("Random Numbers Generated to find Input Numbers is "+count);
			

	}

}
