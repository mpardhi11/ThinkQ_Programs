package Program_Video;

import java.util.Scanner;

public class Pyramid_8 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner (System.in);
		int i,j,row= sc.nextInt();
		
		for (i=1;i<=row;i++)
		{
			for (j=row;j>=i;j--)
				System.out.print("*");
			
			  for (int k=1;k<=i;k++) 
				  System.out.print("\u00D7");
			 
			
			System.out.println("");
		}
		
	}


}
