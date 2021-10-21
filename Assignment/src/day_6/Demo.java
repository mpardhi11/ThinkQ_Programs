package day_6;
/*
 * Create a class Demo. 
 * In class Demo, declare a member variable x of type int as final.
 * In main method -
 * a. Create an object of type Demo. 
 * 		Try to change the value of x.
 * b. Now declare and implement a method display 
 * 		and make it final. 
 * 		Create a class DemoChild which extends Demo. 
 * 		In DemoChild, try to override the method display.
 * c. Now declare the class DemoChild as final 
 * 		and try to extend the class DemoChild.
 */
final class DemoChild extends Demo {
	final public void display () {
		
	}
}

class D2Child extends DemoChild {
	
}
public class Demo {
		final int x;
		
		final public void display () {
			
		}
		
		public static void main (String args[]) {
			Demo d = new Demo ();
			d.x=50;
			
		}
}


