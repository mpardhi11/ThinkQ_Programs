package day_7;

import java.util.Scanner;

/*
 * 3. Take 10 integer inputs from user and store them in an array. 
 * Again ask user to give a number. 
 * Now, tell user whether that number is present in array or not.
 */
public class Q3 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter number to Search");
		int x =sc.nextInt();
		
		int count=0;
		for (int aa :arr) {
			if (aa == x)
				count++;
		}
		
		if (count>0) {
			System.out.println(x+" is present in array");
		}
		
		else {
			System.out.println(x+" is not present in array");
		}
		
		sc.close();
	}

}
