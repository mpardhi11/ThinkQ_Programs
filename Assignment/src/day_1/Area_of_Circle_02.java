package day_1;
/*
 * 6. Write a java program to calculate area of circle.
 */
import java.util.Scanner;



public class Area_of_Circle_02 {
	
	public static void main(String[] args) {
		
		float area=0.0f,r=0.0f,pi=3.1415f;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter radius : ");
		r = scan.nextFloat();
		
		
		area = pi*r*r;
		System.out.println("Area of Circle " + area);
		
		scan.close();

	}


}
