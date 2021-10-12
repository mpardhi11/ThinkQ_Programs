package Program_Video;

import java.util.Scanner;

public class Pyramid_5 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner (System.in);
		int i,j,k,row= sc.nextInt();
		
		for (i=1;i<=row;i++)
		{
			for (j=1;j<i;j++)
				System.out.print(" ");
			for (k=i;k<=row;k++)
				System.out.print(k+" ");
		System.out.println();
		}
		
		for (i=row-1;i>=1;i--)
		{
			for (j=1;j<i;j++)
				System.out.print(" ");
			for (k=i;k<=row;k++)
				System.out.print(k+" ");
			/*
			 * for (int n=l;n<l;n++) System.out.print(n +"_");
			 */
			System.out.println();
		
			}
	}

}
