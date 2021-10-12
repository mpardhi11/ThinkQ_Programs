package day_3;
/*
 * 1. create class Student and create 2 objects of Student using new keyword
 * 
 * 2. Now id, name in student class. 
 * assign value to id, name there Itself 
 * and in main method print values 
 * then change value of instance variables 
 * and again print the values 
 * (Observe you cannot access id directly without creating object)
 * 
 * 3. Create getId() method in Student class. 
 * call getId() method from displayData method 
 * so that you know that one method can be called from another method. 
 * Return id from getId() method 
 * and set that id to the instance variable in displayData method.
 * 
 * 4. Add display method inside Student class 
 * change values of id, name in that method 
 * & also print the changed values in same method. 
 * Call display method from main method.
 */
public class Student {
		int id = 1234;
		String name = "Mohit";
		
	public int getId()
	{
		return id = 888888;
	}
	
	public void displayData ()
	{
		
		getId();
		System.out.println("Id = " + id);
	}
	public void display()
	{
		id=54321;
		name = "STK";
		System.out.println("Changed Values : ");
		System.out.println(id);
		System.out.println(name);

				
	}
	
	public static void main(String[] args) {

		Student R1 = new Student();
		//Student R2 = new Student();
		
		System.out.println("1-----------------------1");
		System.out.println(R1.id);
		System.out.println(R1.name);
		System.out.println("2-----------------------2");
		R1.id=456789;
		R1.name="Ram";
		System.out.println(R1.id);
		System.out.println(R1.name);
		System.out.println("3-----------------------3");
		R1.displayData(); //Id Only
		System.out.println("4-----------------------4");
		R1.display(); //All Values

		
	}

}
