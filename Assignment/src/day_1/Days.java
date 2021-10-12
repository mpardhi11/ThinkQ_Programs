package day_1;

import java.util.Scanner;

/*
 * 8. Write a Java program to convert days into years, weeks and days.
 */
public class Days {

	public static void main(String[] args) {
		int days;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Days : ");
		days =sc.nextInt();
		int years =days/365;
		int months = (days%365)/30;
		int rdays = ((days%365)%30);
		System.out.println(days+" Days "+"= "+years+" Year "+months+" Months "+rdays+" Days");
		sc.close();
	}

}
