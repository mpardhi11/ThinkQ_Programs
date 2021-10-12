package day_02;

import java.util.Scanner;

public class Q04_02 {
	
	public boolean isDigit (int y) {
		int x=y;
		boolean b=false;
		if (x>0) {
			System.out.println("Enter a Number to SEARCH: ");
			Scanner sc = new Scanner (System.in);
			int SEARCH=sc.nextInt();
			sc.close();
			while (x>0) {
			int last_No=x%10;
			if (SEARCH==last_No) {
				b=true;
				break;
			}
				
			else {
				b=false;
				}
				x/=10;
			}
		}
		
		else {
			System.out.println("Negative");
		}
		return b;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner (System.in);
		int x=sc.nextInt();
		
		Q04_02 obj1 = new Q04_02();
		System.out.println("Test : "+obj1.isDigit(x));
		sc.close();
		
	}

}



