package day_26;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int[]  arr = new int [5];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter : ");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i=0;i<arr.length-1;i++) {
			
		for (int j=i;j<arr.length-1;j++) {
			if (arr[i]<arr[j+1])
			{
				
				int temp=arr[i];
				arr[i]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
		
		for (int aa : arr) {
			System.out.print(aa + " ");
		}

	}

}
