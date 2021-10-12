package Day_2;

import java.util.Scanner;
/*
 * 	Write a Java program to input basic salary of an employee and calculate its
	Gross salary according to following -
	Basic Salary <= 10000: HRA = 20%, DA = 80%
	Basic Salary <= 20000: HRA = 25%, DA = 90%
	Basic Salary >20000: HRA = 30%, DA = 95%
	
	Gross salary = Basic salary + HRA (House rent allowance) + DA
 */
public class Program_5 {

	public static void main(String[] args) {

		
		

		double BasicSA,HRA,DA;
		System.out.println("Enter Basic Salry : ");
		Scanner sc = new Scanner(System.in);
		BasicSA=sc.nextDouble();
		sc.close();
		
		if (BasicSA<=10_000)
		{
			HRA=(BasicSA*20)/100;
			DA= (BasicSA*80)/100;
			System.out.println("HRA = : "+HRA);
			System.out.println("DA = : "+DA);
			System.out.println("Gross Salary := " + (BasicSA+HRA+DA));
				
		}
		
		else if (BasicSA<=20_000)
		{
			HRA=(BasicSA*25)/100;
			DA= (BasicSA*90)/100;
			System.out.println("HRA = : "+HRA);
			System.out.println("DA = : "+DA);
			System.out.println("Gross Salary := " + (BasicSA+HRA+DA));
				
		}
		
		else 
		{
			HRA=(BasicSA*30)/100;
			DA= (BasicSA*95)/100;
			System.out.println("HRA = : "+HRA);
			System.out.println("DA = : "+DA);
			System.out.println("Gross Salary := " + (BasicSA+HRA+DA));
				
		}
	}

}
