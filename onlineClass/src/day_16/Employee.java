package day_16;

class Dept {
	int dept_Id;
	String dept_Name;
	
	public void getData (int dept_Id, String dept_Name) {
		this.dept_Id=dept_Id;
		this.dept_Name=dept_Name;	
	}
	
	public String toString() {
		return dept_Id+" "+dept_Name;
	}
	
	
}
public class Employee {
	
	int e_Id;
	float e_Salary;
	Dept d;
	
	Employee(int e_Id,float e_Salary,Dept d){
		this.e_Id=e_Id;
		this.e_Salary=e_Salary;
		this.d=d;
	}
	
	private void display() {
		System.out.println(e_Id+" "+e_Salary+" "+d.toString());
	}
	
	
	
	public static void main(String[] args) {
		Dept d=new Dept();
		d.getData(123, "Acount");
		
		Employee e= new Employee(101,123.4566f,d);
		e.display();

	}

}
