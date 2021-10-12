package Program_Video;

import java.util.Scanner;

public class If_else_Ladder_Percentage {

	public static void main(String[] args) {
		int M1,M2,M3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks for Physics : ");
		M1= sc.nextInt();
		System.out.println("Enter Marks for Chemistry : ");
		M2= sc.nextInt();
		System.out.println("Enter Marks for Maths : ");
		M3= sc.nextInt();
		
		float per = (M1+M2+M3)/300.0f*100.0f;
		
		System.out.println("The Percentage of PCM Group : " + per+"%");
		
		if (per >= 80.00f)
			System.out.println("Student Score A+ grade in PCM");
		else if (per >= 65.00f)
			System.out.println("Student Score A grade in PCM");
		else if (per >= 50.00f)
			System.out.println("Student Score B grade in PCM");
		else if (per >= 45.00f)
			System.out.println("Student Score C grade in PCM");
		else 
			System.out.println("Student Fail in PCM");
	

	}

}
