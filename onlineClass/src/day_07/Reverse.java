package day_07;

import java.util.Scanner;
/*
 * Write a Code to Reverse number
 */
public class Reverse {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int Num,reverse=0;
		Num = sc.nextInt();
		while(Num>0)
		{
			int temp=Num%10;
			reverse = reverse*10+temp;
			Num/=10;
		}
		System.out.println("Reverse : "+reverse);
		sc.close();
	}

}
