package day_10;

public class Employee {

	int id;
	String name;
	int salary;
	
	void accept()
	{
		id=300;
		name="Amit";
		salary=67777;
	}
	void show()
	{
		System.out.println(id+" "+name+" "+salary);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.accept();
		e.show();
//		e.id=200;
//		e.name="sagar";
//		e.salary=78000;
//		
//		System.out.println(e.id+" "+e.name+" "+e.salary);
		
	}

}
