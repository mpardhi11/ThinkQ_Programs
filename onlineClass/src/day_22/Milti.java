package day_22;

interface Access_able {
	public void Method1();
}

abstract class Abstract implements Access_able {
	public abstract void Method2();

}

class Class extends Abstract {
	public void Method1() {
		System.out.println("Inside class (Child)");
	}
	
	public void Method2() {
		System.out.println("Inside class Abstract ");
	}
}

public class Milti {

	public static void main(String[] args) {
		
		  Class c = new Class (); 
		  c.Method1(); 
		  c.Method2();
		 
	}

}
