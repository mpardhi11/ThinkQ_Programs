package day_28;

import java.util.Scanner;

public class Student2 {

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

		Student2 s[] = new Student2[2];
		Scanner sc = new Scanner(System.in);
//		for(Student2 ss : s) {
//			
//			ss = new Student2 ();
//			System.out.println("ID : ");
//			int x=sc.nextInt();
//			System.out.println("Marks : ");
//			int y=sc.nextInt();
//			System.out.println("Name");
//			String z=sc.next();
//			
//			ss.setId(x);
//			ss.setMarks(y);
//			ss.setName(z);
//			
//		}
		
		for (int i=0;i<s.length;i++) {
			
			System.out.println("enter id");
			int sid = sc.nextInt();
			
			System.out.println("Enter name");
			String sname = sc.next();

			System.out.println("enter marks");
			int mk = sc.nextInt();
			
			s[i]=new Student2();
			s[i].setId(sid);
			s[i].setName(sname);
			s[i].setMarks(mk);
		}
		
		for(Student2 ss : s)
		{
			System.out.println(ss.getId()+" "+" "+ss.getMarks()+" "+ss.getName());
		}
		sc.close();

	}

}
