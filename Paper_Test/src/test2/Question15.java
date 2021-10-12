package test2;

import java.util.Scanner;

/*
 * 15)1!+2!+3!+4!...n WAP java program to find sum[1M]
 */
public class Question15 {

	public static void main(String[] args) {
		int sum=0,i,j,num,fact;
		
		System.out.println("Enter a Number : ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fact=1;
			for(j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
		}
		System.out.println(sum);
		
		
	}

}
