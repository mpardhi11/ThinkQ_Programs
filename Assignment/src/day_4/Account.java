package day_4;
/*
 * --1. Create a class Account with member Variable: long accountNo, String customerName,
 * 2. In main, create a new object of the Account class and print the instance variables value.
 * 		(Note – Default constructor is provided by Java to facilitate the creation of a new object, 
 * 		here variables are assigned default values)
 * --3. Create default constructor assign new value to all variables and write “ I am in default Constructor”
 * --4. In main, create another object of the Account class and print the member variables value.
 * 	--	(Note – Since you have defined a (default) constructor, Java does not provide another one)
 * --5. Define a constructor which takes all arguments and assigns those values to the instance 
 * --		variables and write “I am in parameterized constructor”
 * --6. In main, to create another object of the Account class using the constructor 
 * --		with all arguments and print the instance variable values.
 * 7. In main method, create 2 Account objects with different account numbers and names 
 * 			and print the values of all the member variables of both the accounts.
 * --8. From Account class, comment the default constructor with no arguments 
 * 		and try to create an Account object by calling the default constructor 
 * 		(Note – If any single constructor is present in the source code, Java will not provide a default)
 */
public class Account {
	long accountNo;
	String customerName;
		
		// default constructor with no arguments
		Account () {
			accountNo=12345;
			customerName="Mohit";
			System.out.println("I am in default Constructor");
			
		}
		
		Account (int accountNo, String customerName)
		{
			this.accountNo=accountNo;
			this.customerName=customerName;
			System.out.println("I am in parameterized constructor");
		}
		
	public static void main(String[] args) {
		Account obj1 = new Account ();
		System.out.println(obj1.accountNo+obj1.customerName);
		Account obj2= new Account(1234,"Girl");
		System.out.println(obj2.accountNo+obj2.customerName);
		
		Account obj3= new Account(55,"Ram");
		System.out.println(obj3.accountNo+obj3.customerName);
		Account obj4= new Account(245,"Sham");
		System.out.println(obj4.accountNo+obj4.customerName);

		
		

	}

}
