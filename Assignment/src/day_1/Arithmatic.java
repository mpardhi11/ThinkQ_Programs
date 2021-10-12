package day_1;

import java.util.Scanner;

/*
 * 5. Write a Java program to enter two numbers and perform all arithmetic operations.
 */
public class Arithmatic {

	public static void main(String[] args) {
		int no1,no2,add,sub,div,mul;
		
		System.out.println("Enter 2 Numbers : ");
		Scanner sc= new Scanner(System.in);
		no1=sc.nextInt();
		no2=sc.nextInt();
		
		add=no1+no2;
		System.out.println("Addition : "+add);
		
		sub=no1-no2;
		System.out.println("Substraction : "+sub);
		
		mul=no1*no2;
		System.out.println("Multiplication : "+mul);
		
		div=no1/no2;
		System.out.println("Division : "+div);
		sc.close();
	}
}

/*
Enter 2 Numbers : 
20
5
Addition : 25
Substraction : 15
Multiplication : 100
Division : 4
*/
