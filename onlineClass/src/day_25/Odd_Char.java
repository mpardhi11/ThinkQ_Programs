package day_25;

import java.util.Scanner;

public class Odd_Char {

	public static void main(String[] args) {
		
		char[]  arr = new char [6];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter : ");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
		}
		
		
		for (char c : arr) {
			System.out.print(c+ " "+"\n");	
		}
		
		//System.out.println("");
		for (int i=0;i<arr.length;i++) {
			if (i%2!=0) {
				System.out.print(arr[i]+ " ");
			}
		}
		sc.close();
	}

}
