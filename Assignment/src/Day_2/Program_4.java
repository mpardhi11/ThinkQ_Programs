package Day_2;

import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to input any alphabet and check whether it is vowel or consonant
		 */
		
		System.out.println("Enter Any Character : ");
		Scanner sc = new Scanner(System.in);
		char z = sc.next().charAt(0);
		sc.close();	
		if (z=='a'||z=='e' || z=='i' || z=='o' || z=='u' ||
			z=='A'||z=='E' || z=='I' || z=='O' || z=='U')
			System.out.println("Chareacter is Vowel");
		else
			System.out.println("Character is Consonent");

	}

}
