package day_13;

public class Emp {

	int id;
	String name,company;
	double salary;
	
	Emp(){
		System.out.println("Default Constructor Called");
		id=101;
		name="E2";
		company="ABC";
		salary=12345.6789;
	}
	
	Emp(int id, String name,String company, double salary){
		System.out.println("Paramatrize Constructor Called");
		this.id=id;
		this.name=name;
		this.company=company;
		this.salary=salary;
	}
	
	private void displayInfo() {
		System.out.println(id+" ID "+name+" Name "+company+" Company "
							+salary+" Salary ");
	}
	public static void main(String[] args) {
		Emp e1=new Emp();
		Emp e2=new Emp(123,"E1","TMK",987654.321);
		
		e1.displayInfo();
		e2.displayInfo();
		
		
		
	}

}
