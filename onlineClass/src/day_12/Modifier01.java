package day_12;

public class Modifier01 {
	public int id;
	protected String name;
	private float Salary;
	long mobileNo;
	
	public void setSal(float Salary) {
		this.Salary=Salary;
	}
	public void obj2data(int id, String name,long mobileNo) {
		this.id=id;
		this.name=name;
		this.mobileNo=mobileNo;
	}
	
	public void id(int id,String name,float Salary,long mobileNo) {
		this.id=id;
		this.name=name;
		this.Salary=Salary;
		this.mobileNo=mobileNo;
		
	}
	
	public void Display () {
		System.out.println("ID = "+id+"name "+name+" Salary "+Salary+" Mobile no "+mobileNo);
	}
	public static void main(String[] args) {
		Modifier01 obj1=new Modifier01();
		obj1.id(123, "mohit", 12345.0f, 123456789);
		obj1.Display();
		
	}

}
