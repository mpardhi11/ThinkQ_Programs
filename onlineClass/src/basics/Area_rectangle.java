package basics;

import java.util.Scanner;

/* Program to Calculate are of Rectangle */
public class Area_rectangle {
	
	public static void main(String[] args) {
		float W=0f,L= 0f,area;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Width : ");
		W = scan.nextFloat();
		
		System.out.println("Enter Length : ");
		L = scan.nextFloat();
		
		area = W*L;
		
		System.out.println("Area of rectangle "+ area);
		
	}


}
