package basics;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n,counter=0,temp;
		
		System.out.println("Enter a Number : ");
		n=sc.nextInt();
		int temp1=temp=n;
		System.out.println("While Loop----------------");
		while (n>0)
		{
			n/=10;
			counter++;         
		}
		System.out.println("Counter : "+ counter);
		
		counter=0;
		System.out.println("for Loop----------------");
		for (;temp>0;temp/=10)
		{
			counter++;
		}
		System.out.println("Counter : "+ counter);
		counter=0;
//		do 
//		{
//			counter++;
//			temp1=temp1/10;
//		} (while temp1>0);
//		System.out.println("Counter : "+ counter);

		
	}

}
