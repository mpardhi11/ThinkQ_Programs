package day_1;

import java.util.Scanner;

public class SimpleIR {

	public static void main(String[] args) {
		float SI,P,R;
		int T;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle");
		P=sc.nextFloat();
		System.out.println("Enter Rate of Interst");
		R=sc.nextFloat();
		System.out.println("Enter Tuner (Must be in Years)");
		T=sc.nextInt();
		
		SI=(P*R*T)/100;
		float Amount=P+SI;
		
		System.out.println("Simple Interst : "+SI);
		System.out.println("Total Amount to Pay : "+Amount);
		
		sc.close();
	}

}
