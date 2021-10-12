package day_02;

import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		/*
		 * W A Java Code to Check Greatest Number 
		 * Between 3 Numbers
		 */
		Double n1,n2,n3;
		System.out.println("Enter 1st Number : ");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextDouble();
		
		System.out.println("Enter 2nd Number : ");
		n2 = sc.nextDouble();
		
		System.out.println("Enter 3rd Number : ");
		n3 = sc.nextDouble();
		
		if (n1>n2)
		{
			if (n1>n3)
				System.out.println("1st Number "+n1+" is Greatest");
			else 
				System.out.println("3rd Number "+n3+" is Greatest");
		}
		
		else {
			if (n2>n3)
				System.out.println("2nd Number "+n2+" is Greatest");
			else 
				System.out.println("3rd Number "+n3+" is Greatest");

		}
	}

}
