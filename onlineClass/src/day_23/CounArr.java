package day_23;

import java.util.Scanner;

public class CounArr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a1 = new int[5];
		int count=0;
		System.out.println("Enter "+a1.length);

		for (int aa : a1) {
			aa=sc.nextInt();
			if (aa%2!=0) {
				count++;
			}
		}
		System.out.println("Count of ODD Elements : "+count);
		sc.close();

	}

}
