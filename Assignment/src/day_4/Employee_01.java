package day_4;

public class Employee_01 {
	int id;
	String name;
	float basicSalary,HRA,DA,grossSalary;
	
	Employee_01 ()
	{
		id=12223;
		name="Ram";
		basicSalary =16000.0f;
	}
	
	Employee_01 (int id, String name, float basicSalary)
	{
		this.id=id;
		this.name=name;
		this.basicSalary =basicSalary;
	}
	
	

	public void calculate() {
		HRA = (basicSalary/100)*35.0f;
		DA =(basicSalary/100)*20.0f;
		grossSalary=basicSalary+HRA+DA;
	}
	public void showDetails() {
		System.out.println("id = "+id);
		System.out.println("Name : "+name);
		System.out.println("Baisc Salry = "+basicSalary);
		System.out.println("HRA = "+HRA);
		System.out.println("DA = "+DA);
		System.out.println("Gross Salary = "+grossSalary);
	}
	public static void main(String[] args) {
		Employee_01 obj1 = new Employee_01();
		Employee_01 obj2 = new Employee_01(12345,"Mohit",15000);

		obj1.calculate();
		obj1.showDetails();
		obj2.calculate();
		obj2.showDetails();
	}

}
