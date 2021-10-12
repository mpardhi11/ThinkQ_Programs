package day_4;

public class Student_02 {

	int rollNo,physics,chemistry,maths;
	String name;
	
	Student_02()	
	{
		
		this(12345,"Mohit02",85,73,89);
	}
	Student_02 (int rollNo,String name,int physics,int chemistry,int maths)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.physics=physics;
		this.chemistry=chemistry;
		this.maths=maths;

	}
	
	public void display() {
		System.out.println("Name = "+name);
		System.out.println("Roll No : "+rollNo);
		System.out.println("physics = "+physics);
		System.out.println("chemistry = "+chemistry);
		System.out.println("maths = "+maths);
	}
	public static void main(String[] args) {

		Student_02 obj1=new Student_02();
		Student_02 obj2=new Student_02(1235,"Mohit01",85,73,89);
		
		obj1.display();
		obj2.display();
	}

}
