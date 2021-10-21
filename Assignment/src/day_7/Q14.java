package day_7;

import java.util.Scanner;

/*
 * 14. Write a java program to separate zeros from non-zeros in an integer array?
Input Array - [12, 0, 7, 0, 8, 0, 3]
Input Array After moving zeros to end - [12, 7, 8, 3, 0, 0, 0]
 */
public class Q14 {

	public static void main(String[] args) {
		int[]  arr = new int [10];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter "+arr.length+" Elements");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i=0;i<arr.length-1;i++) {
			
		for (int j=i;j<arr.length-1;j++) {
			if (arr[i]==0)
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
