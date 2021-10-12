package Program_Video;

import java.util.Scanner;

public class Account_Age {

	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		
		age = sc.nextInt();
		
		if (age >=18)
			System.out.println("Your age is : "+ age + "\nand you are eligbe for account Open");
			else 
				System.out.println("Age in Invalid n=or Account Open");
	}

}
