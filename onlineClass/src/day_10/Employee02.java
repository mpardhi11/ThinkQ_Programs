package day_10;

public class Employee02 {
	int id;
	String name;
	float salary;

	void getDtails() {
		id=123456;
		name="Ram";
		salary=12345.67f;
	}
	void showDetails() {
		System.out.println("ID : "+id+" Name : "+name+" Salary: "+salary);
	}
	
	public static void main(String[] args) {
		Employee02 obj1=new Employee02();
		obj1.id=12345;
		obj1.name="Mohit";
		obj1.salary=100000.125f;
		
		obj1.showDetails();
		
		obj1.getDtails();
		obj1.showDetails();
		
		
	}

}
