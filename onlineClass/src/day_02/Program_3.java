package day_02;

import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		/*
		 * W A Java Code to Check Greatest number
		 * between two Numbers
		 */

		Double n1,n2;
		System.out.println("Enter 1st Number : ");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextDouble();
		
		System.out.println("Enter 1st Number : ");
		n2 = sc.nextDouble();

		if (n1>n2)
			System.out.println("1st Number is Greater : "+n1);
		else
			System.out.println("2nd Number is Greater : "+n2);
	}

}
