package Day_2;

import java.util.Scanner;

/*
 * Write a Java program to create a Simple Calculator using switch. 
 * Program should accept 2 numbers. 
 * Console will display following choices -
 * 1. Add 2. Subtract 3. Multiply 4. Divide
 * Based on user input, perform given operation.
 */
public class Program_6 {

	public static void main(String[] args) {

		float x1,x2;
		System.out.println("Enter 2 Numbers : ");
		Scanner sc = new Scanner(System.in);
		x1=sc.nextFloat();
		x2=sc.nextFloat();
		
		System.out.println("1. Add 2. Subtract 3. Multiply 4. Divide");
		int choise = sc.nextInt();
		sc.close();
		
		switch (choise)
		{
			case 1 :
				System.out.println("Addition = "+(x1+x2));
			break;
			
			case 2 :
				System.out.println("Substract = "+(x1-x2));
			break;
			
			case 3 :
				System.out.println("Multiply = "+(x1*x2));
			break;
			
			case 4 :
				System.out.println("Divide = "+(x1/x2));
			break;
			
			default :
				System.out.println("Invalid Option");
			break;
		}
		
		
	}

}
