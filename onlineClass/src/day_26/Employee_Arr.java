package day_26;

import java.util.Arrays;
import java.util.Scanner;

class employee {
	int employee_id;
	String employee_Name;
	float employee_Salary;
	
	employee (int x,String y, float z)
	{
		employee_id=x;
		employee_Name=y;
		employee_Salary=z;
	}
	public String toString () {
		return employee_id+ "\t" +employee_Name+"\t"+employee_Salary+"\n";
	}
}


public class Employee_Arr {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		
		employee[] arr=new employee[5];
		arr[0]=new employee(100,"Mohit",123.55f);
		arr[1]=new employee(102,"abc",1.55f);
		arr[2]=new employee(104,"gta",23.55f);
		
		System.out.println(Arrays.toString(arr));


	}

}
