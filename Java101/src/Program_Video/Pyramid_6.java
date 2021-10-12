package Program_Video;

import java.util.Scanner;

public class Pyramid_6 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner (System.in);
		int i,j,k,row= sc.nextInt();
		
		for (i=1;i<=row;i++)
		{
			for (j=1;j<=i;j++)
				System.out.print(j+" ");
		System.out.println();
		}
		
	}

}
