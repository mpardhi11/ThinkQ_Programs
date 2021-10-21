package day_25;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		
		int[]  arr = new int [5];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter : ");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int min =arr[0];
		
		for (int i=0;i<arr.length;i++) {
			if (min>arr[i])
				min=arr[i];
		}
		System.out.println("Minimum of array "+min);

		int Max =arr[0];
		for (int i=0;i<arr.length;i++) {
			if (Max<arr[i])
				Max=arr[i];
		}
		
		System.out.println("Max of array : "+Max);
		sc.close();
	}
	
}
