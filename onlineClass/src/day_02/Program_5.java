package day_02;

import java.util.Scanner;
/*
 * W A Java Code to Check Greatest Number 
 * Between 3 Numbers Using LOGICAL Operator		
 */
public class Program_5 {

	public static void main(String[] args) {
		
		Double n1,n2,n3,big;
		System.out.println("Enter 3 Numbers : ");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		if (n1>n2 && n1>n3)
			big = n1;
		else if (n2>n1 && n2>n3)
			big = n2;
		else 
			big = n3;
		System.out.println("Greatest Among three : "+ big);
		}
}
