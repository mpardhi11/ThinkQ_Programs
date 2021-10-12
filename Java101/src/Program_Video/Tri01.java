package Program_Video;

import java.util.Scanner;

/*
 * 1. Right Triangle Star Pattern
 */
public class Tri01 {

	public static void main(String[] args) {
		int i,j,row=6;
//		System.out.println("Enter rows : ");
//		Scanner sc =new Scanner(System.in);
//		row=sc.nextInt();
//		sc.close();
		
		for(i=1;i<=row;i++)
		{
			for (j=row;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		

	}

}
