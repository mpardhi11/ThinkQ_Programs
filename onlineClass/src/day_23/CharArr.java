package day_23;

import java.util.Scanner;

public class CharArr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] a1 = new char[5];
		System.out.println("Enter "+a1.length);

		for(int i=0;i<=a1.length-1;i++) {
			a1[i]=sc.next().charAt(0);
		}

		for (char c : a1) {
			System.out.print(c+ " ");
		}
		
		sc.close();
	}

}
