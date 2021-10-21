package day_7;
/*
 * 6. Write a program to find the sum and product of all elements of an array.
 */
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum=0,product=1;
		
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			product=product*arr[i];
		}
		
		System.out.println("Sum of all : "+sum
							+"\nProduct of all : "+product);
		sc.close();

	}

}
