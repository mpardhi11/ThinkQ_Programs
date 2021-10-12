package Program_Video;

import java.util.Scanner;

public class Switch_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p;
		System.out.println("Enter Passanger Number : ");
		p= sc.nextInt();
		System.out.println("Pasanger number are : " +p+ " So");
		switch(p)
		{
			case 1:
			case 2:
			case 3:
			case 4: 
				System.out.println("let's Arrange Car");
				break;
			case 8 :
				System.out.println("let's Arrange Vertiga");
				break;
			case 14 :
				System.out.println("let's Arrange Traveller");
				break;
			case 25 :
				System.out.println("let's Arrange Mini Bus");
				break;
			default :
				System.out.println("Invalid Number : ");
		}
	}

}
