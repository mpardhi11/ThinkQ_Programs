package basics;

import java.util.Scanner;

public class sUM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n,counter=0,sum=0,temp;
		
		System.out.println("Enter a Number : ");
		n=sc.nextInt();
		int F=n;
		System.out.println("While Loop----------------");
		while (n>0)
		{
			temp=n%10;
			sum=sum+temp;
			n/=10;
			         
		}
		System.out.println("Sum = "+sum);
		
		System.out.println("for Loop----------------");
		sum=0;
		temp=0;
		for (;F>0;F/=10)
		{
			temp=F%10;
			sum=sum+temp;
		}
		System.out.println("Sum = "+sum);
	}
}
