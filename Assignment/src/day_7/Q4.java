package day_7;

import java.util.Scanner;

/*
 * 4. Take 20 integer inputs from user and print the following: 
 * number of positive numbers 
 * number of negative numbers 
 * number of odd numbers 
 * number of even numbers 
 * number of 0s.
 */
public class Q4 {

	public static void main(String[] args) {
		int[] arr = new int[20];
		int P_count=0,N_count=0,O_count=0,E_count=0,Z_count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				P_count++;
			if(arr[i]<0)
				N_count++;
			if(arr[i]==0)
				Z_count++;
			if(arr[i]%2==0)
				E_count++;
			if(arr[i]%2!=0)
				O_count++;
		}
		System.out.println("Positive Count : "+P_count+"\nNegative Count"+N_count
							+"\nZero Count : "+Z_count+"\nEven Count : "+E_count
							+"\nOdd Count : "+O_count);
		sc.close();
	}

}
