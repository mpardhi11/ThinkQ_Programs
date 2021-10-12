package basics;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		int i,sum=1;
		System.out.println("Ener a Number : ");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		
		for (i=1;i<=x;i++)
			{
			sum =sum*i;
			}
		
		System.out.println("Factroial : "+ sum);
		sc.close();
	}

}
