package day_02;

import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {
		/*
		 * Write a java code to check no is positive , Negative 
		 * or Zero
		 */

		int No;
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		No = sc.nextInt();
		
		if (No>0)
			System.out.println("You Entered +ve Number : "+ No);
		else if (No<0)
			System.out.println("You Entered -ve Number : "+ No);
		else
			System.out.println("You Entered Zero : "+ No);
			
		
	}

}
