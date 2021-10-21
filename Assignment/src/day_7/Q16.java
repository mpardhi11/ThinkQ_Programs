package day_7;
/*
 * 16. 
 * Write a java program to find all pairs of elements in an 
 * integer array whose sum is equal to a given number?
Input Array - [4, 6, 5, -10, 8, 5, 20]
Input Number - 10
Pairs of elements whose sum is 10 are -
4 + 6 = 10
5 + 5 = 10
-10 + 20 = 10
 */
import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Input Number : ");
		int x = sc.nextInt();
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if ((arr[i]+arr[j])==x) {
					System.out.println("Pairs of elements whose sum is "+x+" are -");
					System.out.print(arr[i]+"\t"+arr[j]+ "\t="+x);
					System.out.println("");
				}	
				}
			}
		sc.close();
	}
}
