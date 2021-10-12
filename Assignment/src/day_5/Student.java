package day_5;
/*
 * 1. WAP to have Student class has roll, name and 
 * Department object should have id and name. 
 * Assign and print individual values in main method
 * (Note - Containment using constructor and getter/setter).
 */
class Department {
	int id;
	String d_Name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDName(String d_Name) {
		this.d_Name=d_Name;
	}
	
}
public class Student {
	int roll;
	String s_Name;
	Department d;
	
	Student (Department d) {
		this.d=d;
		
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public void setSName(String s_Name) {
		this.s_Name=s_Name;
	}
	
	public String toString() {
		return roll + " "+s_Name+" "+d.d_Name+" "+d.id;
	}
	public static void main(String[] args) {
		Department d =new Department();
		d.setId(101);
		d.setDName("Graphic_Department");
		
		Student s= new Student(d);
		
		s.setRoll(121);
		s.setSName("Mohit");
		
		System.out.println(s.toString());
		
	}

}
