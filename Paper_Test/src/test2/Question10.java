package test2;

import java.util.Scanner;

/*
 10) Write a program to find twin prime number. (Accept two no from
user and check, if both are prime and their difference is 2 then they
are twin prime). [2M]

 */
public class Question10 {

	public int prime (int num)
	{
		int count=0,n=num;
		
		for (int i=2;i<n;i++)
		{
			if (n%i==0)
				count++;
		}
		
		if (count==0) {
			System.out.println(n+" is prime number");
			
			return n;
		
		}
		
		else {
			System.out.println(n+" is not prime number");
			return 0;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Question10 obj1= new Question10();		
		int n1,n2;
		System.out.println("Enter two Number : ");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();

		n1=obj1.prime(n1);
		n2=obj1.prime(n2);
		
		if ((n1-n2 == 2) || (n1-n2 == -2))	{
			System.out.println("they are twin prime");
		}
		
		else{
			System.out.println("they are NOT twin prime");
		}
		
		
	}

}
