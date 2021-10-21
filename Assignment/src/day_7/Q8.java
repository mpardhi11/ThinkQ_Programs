package day_7;

import java.util.Scanner;

/*
 * 8. WAP to find the maximum and minimum value in an array.
 */
public class Q8 {

	public static void main(String[] args) {
		
		int[]  arr = new int [5];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter : ");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int Min =arr[0],Max =arr[0];
		for (int i=0;i<arr.length;i++) {
			if(Min>arr[i])
				Min=arr[i];
			if (Max<arr[i])
				Max=arr[i];
		}
		
		System.out.println("Minimum of array : "+Min);
		System.out.println("Maximum of array : "+Max);
		sc.close();

	}

}
