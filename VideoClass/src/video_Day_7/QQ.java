package video_Day_7;

import java.util.Scanner;

public class QQ {

	public static void main(String[] args) {
		
		System.out.println("Enter");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		float[] a = new float[size];
		float[] b = new float[size];
		System.out.println("Enter "+ a.length+" Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextFloat();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);;
		}
		
		System.out.println(a.length + " "+b.length);
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		

		
	}

}
