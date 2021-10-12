package Program_Video;

import java.util.Scanner;

/*
 * Two numbers are entered through the keyboard. 
 * Write a program to find the value of one number raised to the power of another. 
 * (Do not use Java built-in method)
 */
public class Power {

	public static void main(String[] args) {
		Scanner KB = new Scanner (System.in);
		
		int temp,num1,num2;
		System.out.println("Enter Base Number : ");
		num1=KB.nextInt();
		
		System.out.println("Enter Power Number : ");
		num2=KB.nextInt();
		
		temp=num1;
		for (int i=1;i<num2;i++)
		{
			temp = temp*num1;
		}
		
		System.out.println(num1+"power"+num2+"= "+temp);
		

	}

}
