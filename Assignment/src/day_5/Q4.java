package day_5;
/*
 * 4. Create a class with display() method 
 * that prints "This is parent class" and 
 * its subclass with another view() method 
 * that prints "This is child class". 
 * Now, create an object for each of the class and call 
 * 1 - method of parent class by object of parent class 
 * 2 - method of child class by object of child class 
 * 3 - method of parent class by object of child class
 */

/*
 * 5. In the above example, 
 * declare the method of the parent class as private 
 * and then repeat the first two operations 
 * (You will get error in the third).
 */
class Display {
	public void display() {
		System.out.println("This is parent class");
	}
	
	private void toPrint () {
		System.out.println("Private Method to Print");
	}
}

class View extends Display {
	public void view () {
		System.out.println("This is child class");
	}
}
public class Q4 {

	public static void main(String[] args) {
		// 1 - method of parent class by object of parent class
		Display d = new Display ();
		d.display();
		
		//2 - method of child class by object of child class
		View v = new View();
		v.view();
		
		//3 - method of parent class by object of child class
		v.display();
		
		//1 - method of parent class by object of parent class
		//d.toPrint();
		
		//2 - method of child class by object of child class
		//v.toPrint();
	}

}
