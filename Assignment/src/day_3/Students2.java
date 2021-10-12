package day_3;
import day_3.Students;
/*
 * a. In main method outside the class but in same package – create object of type Student.
 * b. Try to access rollno outside the class.
 * c. Try to access age outside the package.
 * d. Also try to access private methods outside the class 
 * 		and protected methods outside the package.
 */
public class Students2 {

	public static void main(String[] args) {
		Students B1=new Students();
		System.out.println(B1.rollNo);
		System.out.println(B1.age);
		System.out.println(B1.doProtected());
		B1.doPublic();

	}

}
