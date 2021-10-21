package day_7;

import java.util.Scanner;

/*
 * 11. WAP to arrange the elements of an given array of integers 
 * where all negative integers appear 
 * before all the positive integers.
 */
public class Q11 {

	public static void main(String[] args) {
		int[]  arr = new int [10];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter "+arr.length+" Elements");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i=0;i<arr.length-1;i++) {
			
		for (int j=i;j<arr.length-1;j++) {
			if (arr[i]>arr[j+1])
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
		sc.close();
	}

}
