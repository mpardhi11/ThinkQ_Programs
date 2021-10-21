package day_7;

import java.util.Scanner;

/*
 * 1. Take 10 integer inputs from user and store them in an array and print them on screen.
 */
public class Q1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(arr.length+" Elements");
		for(int aa :arr) {
			System.out.print(aa+"\t");
		}
		
		sc.close();

	}

}
