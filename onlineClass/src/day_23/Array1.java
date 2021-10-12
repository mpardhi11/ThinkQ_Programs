package day_23;

import java.util.Scanner;

public class Array1 {
	
	public static void main (String a[]) {
		
		Scanner sc = new Scanner(System.in);
		int[] a1 = new int[5];
		System.out.println("Enter "+a1.length);

		for(int i=0;i<=a1.length-1;i++) {
			a1[i]=sc.nextInt();
			
		}
		
		for (int i=0;i<=a1.length-1;i++) {
			System.out.print(a1[i]+ " ");
			
		}
		System.out.println("");	
		for (int aa : a1) {
			System.out.print(aa);
			
		}
		System.out.println("");
		
		int i=4;
		while (i>=0) {
			System.out.print(a1[i]+ " ");
			
			i--;
		}
		System.out.println("");
		
		for (i=a1.length-1;i>=0;i--) {
			System.out.print(a1[i]+ " ");
			
		}
		System.out.println("");
	}
	
}
