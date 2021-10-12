package Program_Video;

import java.util.*;


class reverse 
{
	String original,rev="";
	int i,len;
	
	public void getData(String s) {
		original=s;
		len=original.length();
	}
	
	public void calculate ()
	{
		for (i=len;i>=0;i--)
		{
			
		}
	}
}

public class Palindrome {

	public static void main(String[] args) {
		int number,original,temp,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number Only");
		number =sc.nextInt();
		original=number;
		
		while(number>0) {
			temp=number%10;
			reverse=(reverse*10)+temp;
			number/=10;
		}
		
		System.out.println("Reverse Number : "+reverse);
		
		if(reverse==original)
			System.out.println("Enter Number is Palindrome");
		else
			System.out.println("Enter Number is NOT Palindrome");
		//====================================
		reverse r=new reverse();
		System.out.println("Enter a String : ");
		String S=sc.nextLine();
		
		r.getData(S);

		
		
		
	}

}
