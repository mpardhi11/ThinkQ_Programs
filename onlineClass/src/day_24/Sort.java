package day_24;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a1 = new int[10];
		System.out.println("Enter "+a1.length);
		int[] positive = new int[10];
		int[] negative = new int[10];
		for(int i=0;i<=a1.length-1;i++) {
			a1[i]=sc.nextInt();
			
		}
		int i,j;
		int k=0;
		int p=0;
		for (i=0;i<=a1.length-1;i++) {
			if (a1[i]>0)
			{
				
					positive[k]=a1[i];
					k++;
			
			}
			
			else
			{
			
					negative[p]=a1[i];
					p++;
			
			}
			}

		for (i =0;i<p;i++) 
		{
			System.out.println(negative[i]);		
		}
		System.out.println("//////////////////////////////////");
		for (i =0;i<k;i++) 
		{
			System.out.println(positive[i]);
		}
		
		}
	}

