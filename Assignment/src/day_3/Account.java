package day_3;

import java.util.Scanner;

/*
 * 6. Create a class Account containing following methods -
 * insert () to insert account data
 * display () to display account information
 * deposit () to deposit amount
 * withdraw () to withdraw amount
 * check_balance() to check balance
 */
public class Account {
	public int i;
	public float de,wd,bal=0.0f;
	public String N;
	Scanner sc = new Scanner(System.in);
	public void display()
	{
		System.out.println("Account Number : "+ i);
		System.out.println("Account Holder : "+N);
		System.out.println("Remaining Balance : "+bal);
		
	}
	public void insert ()
	{
		System.out.println("Enter Account Number : ");
		i= sc.nextInt();
		System.out.println("Enter Account Holder Name :");
		N= sc.next();
		System.out.println("Add Minimum Balance >= Rupees 3000");
		bal = sc.nextFloat();
		
	}
	
	public void deposit ()
	{
		System.out.println("Enter Amount to deposit : ");
		de =sc.nextFloat();
		bal = bal+de;
		System.out.println("Total Amount After Deposit : " + bal);
	}
	
	public void withdraw ()
	{
		System.out.println("Enter Amount to withdraw : ");
		wd= sc.nextFloat();
		if (wd>bal)
			System.out.println("Error 404");
		else 
		{
			bal =bal-wd;
			System.out.println("Withdraw Sucessful!!");
			System.out.println("Remaining Amount After Withdraw : " + bal);
		}
		
	}
	
	public void  check_balance()
	{
		System.out.println("Want to Check Closing Balance : ");
		System.out.println("Press 1 for Yes \nPress 2 for No ");
		int cb=0;
		cb=sc.nextInt();
		if (cb==1)
			System.out.println("Closing Balance : "+ bal);
		else if (cb==2)
			System.out.println("Thnak You !!!");
		else 
			System.out.println("Invalid ");
		
	}
	
	public static void main(String[] args) {
		Account a1 =new Account();
		// a1.display();
		a1.insert ();
		a1.display();
		a1.deposit();
		a1.withdraw();
		a1.check_balance();

	}

}
