package basics;
/* Program to find out cube of number */

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		float c=0f;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		c = scan.nextFloat();
		
		float cube = c*c*c;
		
		System.out.println("Cube of : "+ c +" "+ cube);

	}

}
