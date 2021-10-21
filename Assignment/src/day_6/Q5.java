package day_6;
/*
 * 5. WAP to check whether final method of parent can be inherited in Child class.
 */

class Parent {
	final public void display () {
		System.out.println("final method of parent can be inherited in Child class");
	}
}

class Child extends Parent {
	
}
public class Q5 {

	public static void main(String[] args) {
		Child c = new Child ();
		c.display();

	}

}
/*O/P
 * final method of parent can be inherited in Child class

*/
