package Day_2;

import java.util.Scanner;

/*
 * Write a program that displays the day of the week 
 * corresponding to the number entered 
 * i.e. 1 - "Monday", 2 - "Tuesday" and so on. 
 * For any integer input not between 1 to 7 it should display 
 * "error, day does not exist".
 */
public class Program_7 {

	public static void main(String[] args) {

		System.out.println("Enter day of Week : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		switch(x)
		{
		case 1:
			System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tue");
		break;
		case 3:
			System.out.println("Wed");
		break;
		case 4:
			System.out.println("Thu");
		break;
		case 5:
			System.out.println("Fir");
		break;
		case 6:
			System.out.println("Sat");
		break;
		case 7:
			System.out.println("Sun");
		break;
		
		default :
			System.out.println("error, day does not exist");
		break;
		
		}
	}

}
