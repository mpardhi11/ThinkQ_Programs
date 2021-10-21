package day_7;

import java.util.Scanner;

/*
 * 15. 
 * Integer type array contains values like {72, 69, 76, 76, 79}. 
 * Write a code to replace each array element by 0 if it ends with 9. 
 * So, above array would look like {72, 0, 76, 76, 0}.
 */
public class Q15 {

	public static void main(String[] args) {
		int[]  arr = new int [6];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter "+arr.length+" Elements");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%10==9)
			{
				arr[i]=0;
			}
				
		}
		
		for (int aa : arr) {
			System.out.print(aa + " ");
		}	
		sc.close();

	}

}
