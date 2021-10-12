package day_20;

abstract class A1 {
	abstract public void method_A1 ();
}

abstract class A2 extends A1{
	abstract public void method_A2 ();
}

class XYZ extends A2 {
	public void method_A1() {
		System.out.println("Implemantation to Method_A1 of A1 class");
	}
	
	public void method_A2() {
		System.out.println("Implemantation to Method_A2 of A2 class");
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		XYZ c = new XYZ();
		
		c.method_A1();
		c.method_A2();

	}

}
