package day_17;

import java.util.Scanner;

class father {
	Scanner sc=new Scanner(System.in);
	String surname;
	String fname;
	
	public void getData() {
		System.out.println("Enter Name");
		fname=sc.next();
		System.out.println("Enter Name Lastname");
		surname=sc.next();
	}
}


class son extends father{
	String sName;
	
	public void getname(String sName) {
		this.sName=sName;
	}

	public void display() {
		System.out.println("Full Name "+sName+" "+surname+" "+fname);
	}
}
public class Single {

	public static void main(String[] args) {
	
			son s=new son();
			s.getname("Ram");
			s.getData();
			s.display();
	}

}
