package day_02;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner (System.in);
		for (int i=1;i<=5;i++) {
			System.out.println("Enter a Number : ");
			int x=sc.nextInt();
			
			if (x>0) {
				sum=sum+x;
			}
			
			else
				break;
			
		}
		
		System.out.println(sum);

	}

}
