package basics;

import java.util.Scanner;
/*
 * W a code to take 5 subject marks 
 * calculate percentage & on basis of percentage gives grades
 * > 70 --> Dist
 * <60 to 70> ---> 1st class
 * <50 to 60> ---> 2ns class
 * <35 to 50> ---> pass class
 * <35 fail
 */
public class grade {

	public static void main(String[] args) {

		int s1,s2,s3,s4,s5;
		System.out.println("Enter 5 Subject Class");
		Scanner sc = new Scanner (System.in);
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		s4 = sc.nextInt();
		s5 = sc.nextInt();
		
		float percentage = ((s1+s2+s3+s4+s5)*100/500f);
		System.out.println("Percentage : "+ percentage);
		
		if (percentage >=70)
			System.out.println("Dist");
		else if (percentage >=60 && percentage<70)
			System.out.println("1st Class");
		else if (percentage >=50 && percentage<60)
			System.out.println("2st Class");
		else if (percentage >=35 && percentage<50)
			System.out.println("pass");
		else if (percentage <35)
			System.out.println("fail");
		else
			System.out.println("Invalid");
	}

}
