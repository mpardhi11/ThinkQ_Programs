package Program_Video;

import java.util.Scanner;

public class Pyramid_7 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner (System.in);
		int i,j,row= sc.nextInt();
		int count=1;
		
		for (i=1;i<=row;i++)
		{
			for (j=1;j<=i;j++)
				{
				System.out.print(count+" ");
				count=count+1;
				}
			
			count=count+1;
		System.out.println();
		}
		
		
	}

}
