package test2;

import java.util.Scanner;

/*
 * 5) write a java program to check given number is trimorphic  number or not
4 is trimorphic number as its cube (64) contains 4  at the end .
5 is trimorphic number as its cube (625)contains 5 at the end.[2M]

 */
public class Question5 {

	public static void main(String[] args) {
		int i,num,cube=1;
		System.out.println("Enter a Number : ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		cube=num*num*num;
		
		if (cube%10==num)
		{
			System.out.println("number is trimorphic  number");
		}
		
		else
		{
			System.out.println("number is NOT trimorphic  number");
		}
	}

}
