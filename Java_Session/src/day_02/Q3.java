package day_02;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
	
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner (System.in);
		int x=sc.nextInt();
		int y=x,temp=0;
		int sum=0;
		while (x>0) {
			temp=x%10;
			sum=sum+temp;
			x/=10;
		}
		
		if (y%sum==0) {
			System.out.println("Harshad");
		}
		
		else {
			System.out.println("NOT Harshad");
		}
	
	}
	

}
