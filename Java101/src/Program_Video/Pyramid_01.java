package Program_Video;

import java.util.Scanner;

public class Pyramid_01 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner (System.in);
		int i,j,n= sc.nextInt();
		
		for (i=1;i<=5;i++)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print("* ");
				
			}
		
			System.out.println("");
		}

	}

}
