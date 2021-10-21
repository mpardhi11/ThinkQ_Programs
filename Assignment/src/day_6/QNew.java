package day_6;
class Person {
	String name,address;
	int age;
	
	public void getDetails(int a, String n, String add) {
		age=a;
		name=n;
		address=add;
	}
	
	public void ShowDetails() {
		System.out.println("Person Age : "+age);
		System.out.println("Person Name : "+name);
		System.out.println("Person Address : "+address);
	}
}

interface TaxPayer {
	void payTax();	
}

class Employee extends Person implements TaxPayer {
	int empid;
	float basic , hra , da , grossSalary,tax;

	Employee (int id, float b) {
		empid=id;
		basic=b;
	}
	public void payTax() {
		tax= (grossSalary/100)*7;
	}
	
	public void display_employee_details () {
		System.out.println("Employee ID : "+empid+"\nEmployee Basic Salary : "+basic
				+"\nHRA : "+hra+"\nDa : "+da+"\nGrosssalary : "+grossSalary
				+"\nTax paid by Employee : "+tax);
		System.out.println("===============================");
		System.out.println("Employee Salary After Tax : "+(grossSalary-tax));
	}
	
	void calculateSalary() {	
	}
}

class vp extends Employee{
	vp(int x,float y){
		
		super(x,y);
	}
	void calculateSalary() {
		da= (basic/100)*40;
		hra = (basic/100)*20;
		grossSalary=basic+hra+da;
	}
	
}
public class QNew {

	public static void main(String[] args) {
		vp v = new vp(105,23500.0f);
		v.getDetails(26, "Mohit", "Ganesh_Nagar");
		v.calculateSalary();
		v.ShowDetails();
		v.payTax();
		System.out.println("=============================");
		v.display_employee_details();
	}
}