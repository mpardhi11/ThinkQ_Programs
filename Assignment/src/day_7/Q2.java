package day_7;

import java.util.Scanner;

/*
 * 2. WAP to print the alternate values from an array.
 */
public class Q2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i=0;i<arr.length;i+=2) {
			System.out.print(arr[i]+"\t");
		}
	sc.close();
	}

}
