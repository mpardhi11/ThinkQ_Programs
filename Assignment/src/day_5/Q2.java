package day_5;

import java.util.Scanner;

/*
 * Create Employee class which has attributes (id, name, salary, dept, mydate) 
 * Where dept and mydate is class, dept has (dept_id, dept_name) 
 * And mydate has (day, month, year) Display Employee information
 * (Note - Containment using constructor and getter/setter).
 */

class Employee {
	int id;
	String name;
	float salary;
	dept d;
	mydate m;
	Employee() {}
	Employee (int id,String name,float salary,dept d,mydate m) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.d=d;
		this.m=m;
		
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName (String name) {
		this.name=name;
	}
	
	public void setSalary (float salary) {
		this.salary=salary;
	}
	
	public void setData (dept d,mydate m) {
		this.d=d;
		this.m=m;
	}
	
	public void Display () {
		System.out.println("Employee Details are : ");
		System.out.println("Employee : "+id+"\nEmployee Name : "+name+"\nEmployee Salary : "
				+salary+"\nEmployee Depertament ID :"+d.dept_id+"\nEmployee Depertament Name : "
				+d.dept_name+"\nEmployee mydate : "+m.day+m.month+m.year);
	}
}

class dept {
	int dept_id;
	String dept_name;
	dept (){}
	dept(int dept_id,String dept_name) {
		this.dept_id=dept_id;
		this.dept_name=dept_name;
	}
	
	public void setId (int dept_id) {
		this.dept_id=dept_id;
	}
	
	public void setName (String dept_name) {
		this.dept_name=dept_name;
	}
}

class mydate {
	int day, month, year;
	mydate (){}
	
	mydate (int day, int month, int year) {
		this.day=day;
		this.month=month; 
		this.year=year;
	}
	
	public void setData(int day,int month,int year) {
		this.day=day;
		this.month=month; 
		this.year=year;
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Press 1 for Constructor "
				+ "\nPress 2 for getter/setter");
		int x = sc.nextInt();
		sc.close();
		if (x==1) {
			dept d = new dept(1001, "Manager");
			mydate m = new mydate(05, 01, 2021);
			Employee E1= new Employee(121, "Mohit", 12345.67f, d, m);
			E1.Display();
		}
		
		else if (x==2) {
			dept d = new dept();
			mydate m = new mydate();
			Employee E1= new Employee();
			
			d.setId(101);
			d.setName("Marketing");
			
			m.setData(10, 05, 2021);
			
			E1.setId(1258);
			E1.setName("Mohit");
			E1.setSalary(123.456f);
			E1.setData(d, m);
			
			E1.Display();
			
		}
		
		else 
			for (int i=1;i<=5;i++) {
				System.out.println("Invalid 404 error");
			}
	}

}
