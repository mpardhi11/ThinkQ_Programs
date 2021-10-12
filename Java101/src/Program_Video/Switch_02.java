package Program_Video;

import java.util.Scanner;

public class Switch_02 {

	public static void main(String[] args) {
		System.out.println("-----Menu-----");
		System.out.println("1. Add");
		System.out.println("2. Multi");
		System.out.println("3. Div");
		System.out.println("4. Sub");
		System.out.println("--------------");
		
		double n1,n2;
		int m;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		n1 = sc.nextDouble();
		System.out.println("Enter 2nd Number : ");
		n2 = sc.nextDouble();
		
		System.out.println("Which Operation you want to perform ");
		m = sc.nextInt();
		
		switch (m)
		{
			case 1 :
				System.out.println("Addition = " + (n1+n2));
				break;
			case 2 :
				System.out.println("Multi = "+ (n1 * n2));
				break;
			case 3 :
				System.out.println("Div = "+ (n1/n2));
				break;
			case 4 :
				System.out.println("Substraction = "+ (n1-n2));
				break;
			default :
				System.out.println("Invalid Operation");
		}

	}

}
