package Program_Video;

import java.util.Scanner;

/*
 * 1. Right Triangle Star Pattern
 */
public class Tri5 {

	public static void main(String[] args) {
		int i,j,k,row=6;
		System.out.println("Enter rows : ");
//		Scanner sc =new Scanner(System.in);
//		row=sc.nextInt();
//		sc.close();
//		
		for(i=1;i<=row;i++)
		{
			for (j=row;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for (k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		
		for(i=1;i<=row;i++)
		{
			for (j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for (k=i;k<=row;k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		

	}

}