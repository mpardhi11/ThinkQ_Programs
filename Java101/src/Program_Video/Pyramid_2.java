package Program_Video;

import java.util.Scanner;

public class Pyramid_2 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner (System.in);
		int i,j,k,n= sc.nextInt();
		for (i=1;i<=n;i++)
		{
			for (j=n-i;j>=1;j--)
			{
				System.out.print("+ ");
				
			}
			for (k=1;k<=i;k++)
			{
				System.out.print("* ");
				
			}
			System.out.println("");
		}

	}

}
