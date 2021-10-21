package day_7;

import java.util.Scanner;

/*
 * 7. Write a program to check if elements of an array are same or not it 
 * read from front or back. E.g.- {2,3,15,15,3,2}.
 */
public class Q7 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int back=arr.length-1;
		int count=0;
		for(int i=0;i<arr.length/2;i++) {
			if (arr[i]==arr[back])
				count++;
			back--;
		}
		
		if(count==arr.length/2) 
		{
			System.out.println("elements of an array are same");
		}
		else {
			System.out.println("elements of an array are NOT same : "); 
		}
		
		sc.close();
	}

}
