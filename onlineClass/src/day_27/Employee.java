package day_27;

import java.util.Arrays;
import java.util.Scanner;

class Employee1 {
	int id;
	String Name;
	int Salary;
	
	Employee1 (int p,String q,int r) {
		id=p;
		Name=q;
		Salary=r;
	}
	
	public String toString () {
		return id+ "--" +Name+"--"+Salary+"\n";
	}
	
}
public class Employee {
	public static void main(String[] args) {
		Employee1[] a=new Employee1[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("ënter id");
			int eid=sc.nextInt();
			System.out.println("Ënter name");
			String ename=sc.next();
			System.out.println("ënter sal");
			int sal=sc.nextInt();
			
			a[i]=new Employee1(eid,ename,sal);			
		}
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i].Salary > 10000)
			System.out.println(a[i]);
		}
		
		sc.close();
		
		}
	}
