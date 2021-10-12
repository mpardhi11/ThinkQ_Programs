package basics;

import java.util.Scanner;
/*
 * Write a code to calculate Power of number 
 */
public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int base,power,i,sum=1;
		System.out.println("Enter a base Number : ");
		base=sc.nextInt();
	
		System.out.println("Enter a Power Number : ");
		power=sc.nextInt();
		System.out.println("For Loop-------------");

		for (i=1;i<=power;i++)
		{
			sum=sum*base;
			
		}
		System.out.println(base+" power "+power+" = "+sum);
		System.out.println("While Loop-------------");
		sum=1;
		i=1;
		while (i<=power)
		{
			sum=sum*base;
			i++;
		}
	
		System.out.println(base+" power "+power+" = "+sum);
		System.out.println("do While Loop-------------");
		sum=1;
		i=1;
		do {
			sum=sum*base;
			i++;
		} while (i<=power);
		
		System.out.println(base+" power "+power+" = "+sum);

	}

}
