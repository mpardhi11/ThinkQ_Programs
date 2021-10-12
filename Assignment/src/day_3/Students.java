package day_3;
/*
 * --10. Create a class Student with 4 variables called as 
 * --rollNo, admissionNo, age, courseId.
 * --Each of the variables should have one of the access modifier -
 * --public, protected, no-access-modifier and private.
 * --Add 4 methods in the class – 
 * --public method doPublic, 
 * --no access modifier method doDefault, 
 * --protected method doProtected, 
 * --private method doPrivate.
 * --a. In main method outside the class but in same package – create object of type Student.
 * --b. Try to access roll_no outside the class.
 * --c. Try to access age outside the package.
 * d. Also try to access private methods outside the class 
 * 	--	and protected methods outside the package.
 */
public class Students {
	public int rollNo=101;
	protected int admissionNo=202;
	int age=22;
	private int courseId=06;

	public void doPublic()
	{
		System.out.println(doPrivate());
	}
	
	void doDefault()
	{
		
	}
	
	protected int doProtected()
	{
		//System.out.println("Admission No : "+admissionNo);
		return admissionNo;
	}
	
	private int doPrivate()
	{
		System.out.println(admissionNo);
		return courseId;
	}
	
	public static void main(String[] args) {

		Students B2 =new Students();
		B2.doPublic();
	}

}
