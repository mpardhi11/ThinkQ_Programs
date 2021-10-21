package day_24;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a1 = new int[5];
		System.out.println("Enter "+a1.length);
		for(int i=0;i<=a1.length-1;i++) {
			a1[i]=sc.nextInt();
			
		}
		int[] a2 = new int[5];
		System.out.println("Enter "+a1.length);
		for(int i=0;i<=a2.length-1;i++) {
			a2[i]=sc.nextInt();
			
		}
		
		int j=0,k=0;
		int c=a1.length+a2.length;
		int[] join = new int[c];
		for(int i=0;i<=a1.length-1;i++) {
			join[j]=a1[i];
			j++;
		}
		for(int i=0;i<a2.length;i++) {
			join[j]=a2[i];
			j++;
		}
		

		for (int aa : join) {
			System.out.print(aa + " ");
		}
	}

}
