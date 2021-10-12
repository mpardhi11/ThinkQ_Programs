package basics;

import java.util.Scanner;
/*
 * Write a code to Calculate Table of Number
 */
public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i,n;
		System.out.println("Enter a Number for table : ");
		n=sc.nextInt();
		//-------------------
		System.out.println("For Loop---------");
		for (i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+ (n*i));
		}
		//------------------------
       i=1;
		while(i<=10)
		{
			System.out.println(n+" * "+i+" = "+ (n*i));
			i++;
		}
		
		//------------
		i=1;
		//int x=0;
//		do{
//			x=n*i
//			System.out.println(n+" * "+i+" = "+ x));
//			//System.out.println(x);
//			i++;
//		} (while i<10);
		
	}

}
