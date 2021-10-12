package basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner (System.in);
		
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}

}
