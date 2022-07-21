package logicalPrograms;

import java.util.Scanner;

public class dayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Day Of Week Program");
		System.out.println("**********************************");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year");
		int y = sc.nextInt();
		
		System.out.println("Enter Month \n1.January \n2.February \n3.March \n. \n. \n. \n12.December");
		int m = sc.nextInt();
		System.out.println("Enter Day");
		int d = sc.nextInt();
		
		int Y = y-((14-m)/12);
		int X = (Y-(Y-4))-(Y/100)+(Y/400);
		int M = m+(12*((14-m)/12))-2;
		int D = (d+X+(31*M)/12)%7;
		
		System.out.print("The Week day was: ");
		//Switch statement
		switch(D) {
		case 0 :
			System.out.print("Sunday");
			break;
		case 1 :
			System.out.print("Monday");
			break;
		case 2 :
			System.out.print("Tuesday");
			break;
		case 3 :
			System.out.print("Wednesday");
			break;
		case 4 :
			System.out.print("Thursday");
			break;
		case 5 :
			System.out.print("Friday");
			break;
		case 6 :
			System.out.print("Saturday");
			break;
		}
	}

}
