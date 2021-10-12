package day_12;

import java.util.Scanner;

public class Getemp {

	public static void main(String[] args) {
Employee obj=new Employee();
		
		System.out.println("Enter Employee ID, Name and Salary");
		Scanner sc =new Scanner(System.in);
		
		int id=sc.nextInt();
		String name=sc.next();
		float salary=sc.nextFloat();
		
		obj.setID(id);
		obj.setName(name);
		obj.setSalary(salary);
		
		System.out.println(obj.getID());
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());

	}

}
