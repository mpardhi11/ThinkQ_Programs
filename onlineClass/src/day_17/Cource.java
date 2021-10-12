package day_17;
class Student {
	int id;
	String name;
	
	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}
}
public class Cource {
	int id;
	String name;
	Student obj1;
	
	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}
	
	public void setStudent(Student obj1) {
		this.obj1=obj1;
	}
	
	public int getId() {
		return id;
		
	}
	
	public String getName() {
		return name;
		
	}
		
	public static void main(String[] args) {
		Student obj1=new Student();
		obj1.setId(125);
		obj1.setName("Sham");
		//
		//
		
		Cource c=new Cource ();
		c.setId(101);
		c.setName("BBA");
		c.setStudent(obj1);
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		//////////
		System.out.println(c.obj1.id);
		System.out.println(c.obj1.name);
		

	}

}
