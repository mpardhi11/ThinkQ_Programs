package day_25;

import java.util.Scanner;

public class toggleCase {

	public static void main(String[] args) {
		char[]  arr = new char [6];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter : ");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
		}
		
		//int x=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>='a' && arr[i]<='z')
				arr[i]=(char) (arr[i]-32);
			else if (arr[i]>='A' && arr[i]<='Z')
				arr[i]=(char) (arr[i]+32);
			
		}
		for (char c : arr) {
			System.out.print(c+ " "+"\n");	
		}
		
		
			sc.close();
	}

}
