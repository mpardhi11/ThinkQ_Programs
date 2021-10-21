package day_26;

import java.util.Scanner;

public class Count_I {

	public static void main(String[] args) {
		int[]  arr = new int [5];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter : ");
		int count=0;
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter : ");
		int num=sc.nextInt();
		for (int aa : arr) {
			if (aa == num){
				count++;                
			}
			
		}
		
		if (count>0) {
			System.out.println("Count := "+count);
		}
		else {
			System.out.println(num + " 404 not found");
		}

	}

}
