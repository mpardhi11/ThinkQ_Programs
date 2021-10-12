package Day_2;

import java.util.Scanner;

/*
 * Find all prime number between 1 to 50.
 */
public class Program_9 {

	public static void main(String[] args) {
		System.out.println("Enter nth Number : ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,count;
		for (i=2;i<=n;i++)
		{
			count=0;
			for (j=1;j<i;j++)
			{
				if (i%j==0)
				count++;			
			}
			
			if (count==1)
			{
				System.out.println(i);
			}
		}
		
	}

}
