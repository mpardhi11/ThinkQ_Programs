package Program_Video;

import java.util.Scanner;

public class While_01 {

	public static void main(String[] args) {
		int n,count=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		n = sc.nextInt();
				
		System.out.println("-----Table of "+ n +" is -----");
		while (count <=10)
		{
			System.out.println(n +"\u00D7"+count +"="+(n*count));
			count++;
		}

		System.out.println("-----Table of "+ n +" is -----");

	}

}
