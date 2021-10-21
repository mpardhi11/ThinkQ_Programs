package day_28;
/*
Enter Course ID and Name : 
01
Java
Enter Student ID and Name : 
101
Mohit
Enter Course ID and Name : 
02
Python
Enter Student ID and Name : 
102
Tushar
Enter Course ID and Name : 
03
Android
Enter Student ID and Name : 
103
Sagar
1 Java 101 Mohit
2 Python 102 Tushar
3 Android 103 Sagar

 */
import java.util.Arrays;
import java.util.Scanner;

class Student_3{
	int s_Id;
	String s_Name;
	
	Student_3(int x,String y) {
		s_Id=x;
		s_Name=y;
	}
	
}
class Course {
	int id;
	String name;
	Student_3 s1;
	
	Course (int id,String name,Student_3 s1) {
		this.id=id;
		this.name=name;
		this.s1=s1;
	}
	
	public String toString() {
		return (id + " "+ name+" "+s1);
	}
}
public class Q1 {
	
	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Course c[]  = new Course[3];
	
	for(int i=0;i<c.length;i++) {
		System.out.println("Enter Course ID and Name : ");
		int c_Id=sc.nextInt();
		String c_Name=sc.next();
		//===================================
		System.out.println("Enter Student ID and Name : ");
		int s_Id=sc.nextInt();
		String s_Name=sc.next();
		//=============================================
		
		c[i]=new Course(c_Id,c_Name,new Student_3(s_Id,s_Name));
	}
	
	for(Course cc: c) {
		System.out.println(cc.id+" "+cc.name+" "+cc.s1.s_Id+" "+cc.s1.s_Name);
	}
	}
	
}