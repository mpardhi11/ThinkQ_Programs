package video_Day_7;

import java.util.Scanner;

public class Average {

	public static void main (String [] args) {
		System.out.println("Enter Array Size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		float sum=0;
		int[] a = new int[size];
		System.out.println("Enter "+ a.length+" Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		
		float avg = sum/a.length;
		System.out.println("Agerage : "+sum/a.length);
		
	}
}
