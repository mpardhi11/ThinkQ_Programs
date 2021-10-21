package day_29;

import java.util.Scanner;

class Emp{
	int id;
	String name;
	Dept obj;
	
	Emp (int i,String n, Dept d) {
		id=i;
		name=n;
		obj=d;
	}
public String toString () {
	return id+" "+""+name+" "+obj.id+" "+obj.name;
}

}
class Dept{
	int id;
	String name;
	
	 Dept(int i,String n) {
		id=i;
		name=n;
	
}
}
public class Q2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dept obj;
		Emp[] e = new Emp[2];
		
		for (int i=0;i<e.length;i++) {
			System.out.println("Enter ID and Name of Employee : ");
			int E_id=sc.nextInt();
			String E_name=sc.next();
			
			
			System.out.println("Enter ID and Name of Depertament : ");
			int D_id=sc.nextInt();
			String D_name=sc.next();
			
			e[i] =new Emp(E_id,E_name,new Dept(D_id,D_name));
		}
		for(Emp ee : e ) {
			
			System.out.println(ee);
		}

	}

}