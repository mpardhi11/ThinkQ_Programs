package basics;
/* Write a program to  perform the addition of two number */

import java.util.Scanner;

public class Add_2 {

	public static void main(String[] args) {
		int n1,n2,sum;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		n1 = scan.nextInt();
		
		System.out.println("Enter 2nd Number : ");
		n2 = scan.nextInt();
		
		sum = n1+n2;
		
		System.out.println("Sum : " + sum);

	}

}
