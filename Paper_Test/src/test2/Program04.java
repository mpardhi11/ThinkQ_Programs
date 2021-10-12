package test2;

import java.util.Scanner;

/*
 * 4)write a java program to check given number is spy number or not
e.g 123 if sum of digit is equals to product of digit the number is spy       number
i.e 123=1+2+3=6 and 1*2*3=6 so the number is spy  number[2M]

 */
public class Program04 {

	public static void main(String[] args) {

		int num=123,sum=0,mul=1,temp;
		System.out.println("Enter a Number : ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		while(num > 0)
		{
			temp=num%10;
			sum=sum+temp;
			mul=mul*temp;
			num/=10;
		}
		
		if (sum==mul)
		{
			System.out.println("number is spy number");
		}
		
		else
		{
			System.out.println("number is NOT spy number");
		}
		
		sc.close();
	}

}
