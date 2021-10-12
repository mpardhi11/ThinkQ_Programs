package day_5;

import java.util.Scanner;

public class ContainmentExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Details");
		System.out.println("Enter Employee ID");
		int id =sc.nextInt();
		System.out.println("Enter Employee Full Name :");
		String name=sc.nextLine();
		System.out.println("Enter Employee Salary");
		float salary = sc.nextFloat();
		
		System.out.println("Enter Employee Address Details");
		System.out.println("Enter Employee Surve no");
		int Surve=sc.nextInt();
		System.out.println("Enter Employee Address");
		String ad=sc.nextLine();
		System.out.println("Enter Employee Ciy");
		String city=sc.nextLine();
		System.out.println("Enter Employee PIN");
		int pin=sc.nextInt();
		
		//Address add=new Address();
		//Emp E1=new Emp();
		
		sc.close();
	}

}
