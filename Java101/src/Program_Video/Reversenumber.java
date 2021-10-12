package Program_Video;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner KB = new Scanner (System.in);
		
		int i,original,reverse=0,reminder;
		
		System.out.println("Enter a Number to Reverse ");
		original=KB.nextInt();
		
		while (original>0)
		{
			
			reminder=original%10;
			reverse=reverse*10+reminder;
			original = original/10;
		}

		System.out.println("Reverse : "+reverse);
	}

}
