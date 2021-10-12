package Program_Video;

import java.util.Scanner;

public class Pyramid_4 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner (System.in);
		int i,j,k,row= sc.nextInt();
		
		for (i=1;i<=row;i++)
		{
			
			for (j=1;j<=i;j++)
			{
				System.out.print(" ");
			
			}
			
			for (k=i;k<=row;k++)
				System.out.print(k + " ");
			System.out.println();
			
		}

	}

}
