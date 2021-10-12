package Program_Video;

import java.util.Scanner;

public class Pyramid_3 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner (System.in);
		int i,j,k,n= sc.nextInt();
		
		for (i=1;i<=n;i++)
		{
			for (j=i-n;j>=1;j--)
			{
				System.out.print(j+ " ");
				
			}
			for (k=1;k<=i;k++)
			{
				System.out.print("* ");
				
			}
			System.out.println("");
		}

	}

}
