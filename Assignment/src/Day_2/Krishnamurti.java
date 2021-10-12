package Day_2;

import java.util.Scanner;

/*
 * 8. WAP to check no is Krishnamurthy or not (Using while loop)
 */
public class Krishnamurti {

	public static void main(String[] args) {
		int i,fact,n,sum=0,temp_no;
		System.out.println("Enter a Number to check");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		temp_no=n;
		 
		while (temp_no>0)
		{
			int x=temp_no%10;
			fact=1;
			for (i=1;i<=x;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp_no/=10;
		}
		
		if (sum==n)
			System.out.println(n+" is Krishnamurthy");
		else
			System.out.println(n+" is NOT Krishnamurthy");
		sc.close();

	}

}
