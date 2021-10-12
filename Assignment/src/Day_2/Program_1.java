package Day_2;

import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		//Write a java program to find maximum number from given 3 numbers
		
		int n1,n2,n3;
		Scanner sc= new Scanner(System.in);
		sc.close();
		System.out.println("Enter 1st Number : ");
		n1=sc.nextInt();
		
		System.out.println("Enter 2nd Number : ");
		n2=sc.nextInt();
		
		System.out.println("Enter 3rd Number : ");
		n3=sc.nextInt();
		
		if (n1>n2)
		{
			if (n1>n3)
				System.out.println("1st Number "+n1+" is Greater :");
			else 
				System.out.println("3rd Number "+n3+" is Greater :");
		}
		
		else {
			if (n2>n3)
				System.out.println("2nd Number "+n2+" is Greater :");
			else 
				System.out.println("3rd Number "+n3+" is Greater :");
		}
	}

}
