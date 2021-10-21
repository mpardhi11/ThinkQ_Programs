package day_28;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	int marks;

	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	void setMarks(int marks) {
		this.marks = marks;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	int getMarks() {
		return marks;
	}

	public static void main(String[] args) {

		Student s[] = new Student[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			System.out.println("enter id");
			int sid = sc.nextInt();
			System.out.println("Enter name");
			String sname = sc.next();

			System.out.println("enter marks");

			int mk = sc.nextInt();
//			Student std=new Student();
//			std.setId(sid);
//			std.setName(sname);
//			std.setMarks(mk);
//			
//			s[i]=std;
			
			//OR
			
			s[i]=new Student();
			s[i].setId(sid);
			s[i].setName(sname);
			s[i].setMarks(mk);
			
			
			

		}
		
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].getId()+"  "+s[i].getName()+" "+s[i].getMarks());
		}
		

	}

}
