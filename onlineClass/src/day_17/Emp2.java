package day_17;

class Dept {
	int id;
	String name;
	
	public void setId (int id) {
		this.id=id;
	}
	
	public void setName (String name) {
		this.name=name;
	}
}
public class Emp2 {
	
	int eid;
	float eSalary;
	Dept d;
	
	public void id(int x) {
		eid=x;
	}

	public void sal (float x) {
		eSalary=x;
	}
	
	public void Deptx(Dept d) {
		this.d=d;
	}
	public static void main(String[] args) {
		Dept d=new Dept();
		d.setId(123);
		d.setName("Dept:- Pro");
		
		Emp2 e=new Emp2();
		e.id(12345);
		e.sal(123.456f);
		e.Deptx(d);
		
		
	}

}
