package Day_2;

import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		/*Write a java program to find sum of digits in any number. e.g. number is 435 sum is 12
		 * */
		
		int n,sum=0;
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		sc.close();	
		for (sum=0;n!=0;n=n/10)
			sum = sum+n%10;
		System.out.println("Sum : "+sum);
	}
}