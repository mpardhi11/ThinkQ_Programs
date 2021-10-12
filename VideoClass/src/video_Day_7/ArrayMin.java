package video_Day_7;

import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args) {
		System.out.println("Enter Array Size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		
		System.out.println("Enter "+ a.length+" Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if (a[i]<min) {
				min=a[i];
			}
		}

		System.out.println("Min: "+min);
	}

}
