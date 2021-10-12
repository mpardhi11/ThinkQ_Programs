package day_3;

import java.util.Scanner;

/*
 * Give the real time example of encapsulation with code.
 */
public class Encap {

	private int id;
	private String passWord;
	private String name = "Mohit_Pardhi";
	
	public void setPass(String pass)
	{
		this.passWord=pass;
	}
	
	public void setId(int i)
	{
		this.id=i;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getPass()
	{
		return passWord;
	}
	
	public String getName()
	{
		return name;
	}
	public static void main(String[] args) {
		Encap account = new Encap();
		System.out.println("Enter id and passWord");
		Scanner sc= new Scanner(System.in);
		account.setId(sc.nextInt());
		account.setPass(sc.next());
		sc.close();
		
		System.out.println("Log in Successful With id : "+ account.getId());
		System.out.println("Your Account Name is : " + account.getName());

	}

}
