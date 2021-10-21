package day_8;

/*
 2. Employee class with fields (empno, empname, dept) 
 where dept is object of department class 
 with fields (deptId, deptname) 
 
 Write a program to create array of 3 employees 
 each employee will have different department.
 */
class Employee {
	String empno, empname;
	dept d;
	
	Employee (String no,String name,dept de) {
		empno=no;
		empname=name;
		d=de;
	}
	public String toString() {
		return empno+"||"+empname+"||"+d.deptId+"||"+d.deptname;
	}
}

class dept {
	int deptId;
	String deptname;
	
	dept(int id, String name) {
		deptId=id;
		deptname=name;
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		Employee[] e = new Employee[3];
		dept[] d = new dept[3];
		
		d[0] = new dept(121,"Developer");
		d[1] = new dept(136,"Manager");
		d[2] = new dept(147,"Accountnt");
		
		e[0] = new Employee("1234567890","Mr.ABC",d[0]);
		e[1] = new Employee("9876543210","Mr.XYZ",d[1]);
		e[2] = new Employee("4561237890","Mr.PQR",d[2]);
		
		for (Employee ee : e) {
			System.out.println(ee);
			System.out.println("========================================");
		}

	}

}
