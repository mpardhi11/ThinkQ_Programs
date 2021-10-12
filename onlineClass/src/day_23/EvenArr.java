package day_23;

import java.util.Scanner;

public class EvenArr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a1 = new int[10];
		System.out.println("Enter "+a1.length);

		for(int i=0;i<=a1.length-1;i++) {
			a1[i]=sc.nextInt();
			
		}
		
		for (int aa : a1) {
			if (aa%2==0)
				System.out.print(aa+ " ");
		}
		
		sc.close();
	}

}
