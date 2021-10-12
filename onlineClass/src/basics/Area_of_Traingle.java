package basics;

import java.util.Scanner;

public class Area_of_Traingle {

	public static void main(String[] args) {


		float b=0f,h=0f, area=0f;
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter Breath");
		b = scan.nextFloat();
		
		System.out.println("Enter Height");
		h = scan.nextFloat();

		area = 0.5f*b*h;
		
		System.out.println("Area of Traianglr : "+area);
	}

}
